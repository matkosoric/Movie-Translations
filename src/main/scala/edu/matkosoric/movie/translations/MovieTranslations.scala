package edu.matkosoric.movie.translations

import org.apache.spark.sql.functions.{col, _}
import org.apache.spark.sql.functions

/**
  * Comparing english movie names to Croatian translation
  *
  * @author Matko Sorić
  */

object MovieTranslations {

  def main(args: Array[String]): Unit = {
    val sparkSession = SparkConfig.getSparkSession

    // load first tsv file with movies in a dataframe
    val movies1DF = sparkSession.read
      .format("csv")
      .option("header", "true")
      .option("delimiter", "\t")
      .load(SparkConfig.conf.getString("paths.movies1"))

    // load second tsv file with movies in a dataframe
    val movies2DF = sparkSession.read
      .format("csv")
      .option("header", "true")
      .option("delimiter", "\t")
      .load(SparkConfig.conf.getString("paths.movies2"))

    // workaround for GitHub policy of a 100MB limit on file size
    val moviesDF = movies1DF.union(movies2DF).withColumnRenamed("titleId", "titleId_orig")

    // load ratings
    val ratingsDF = sparkSession.read
      .format("csv")
      .option("header", "true")
      .option("delimiter", "\t")
      .load(SparkConfig.conf.getString("paths.ratings"))
      .withColumnRenamed("tconst", "titleId_usp")


    val moviesDF_HR = moviesDF.filter(col("region").equalTo("HR"))
      .select(col("titleId_orig").alias("titleId_orig_HR"), col("title").alias("titleHR"))

    val usporedba = moviesDF.join(moviesDF_HR , moviesDF("titleId_orig") === moviesDF_HR ("titleId_orig_HR"), "inner")
      .filter(col("region").equalTo("US"))

    val usporedba_rating = usporedba.join(ratingsDF, ratingsDF("titleId_usp") === usporedba("titleId_orig"))

    val usporedba_final = usporedba_rating
      .select(col("titleHR"), col("title"), col("numVotes"))
      .withColumn("duzina_naslova", functions.length(col("title")))
      .filter(col("duzina_naslova") < 60)
      .drop(col("duzina_naslova"))
      .sort(asc("titleHR"))

    usporedba_final
      .repartition(1)
      .write.format("com.databricks.spark.csv")
      .option("header", "true")
      .mode("overwrite")
      .save("result")

    usporedba_final
      .repartition(1)
      .show(1000, false)

  }
}
