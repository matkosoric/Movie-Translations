# Demonstrating Spark on Croatian movie translations

Comparing movie titles on English with Croatian translation


### Dataset

Used dataset is a subset of official IMDB, available at:
https://datasets.imdbws.com/


### Results

Output will be located in the untracked location /data/__default__/user/current/result/ as a standard part-00000... csv file.

Example CSV is in /src/main/resources/output-example.csv

Terminal output looks like this:
<pre><code>
+--------------------------------------------------------------------------+-------------------------------------------------------+--------+
|titleHR                                                                   |title                                                  |numVotes|
+--------------------------------------------------------------------------+-------------------------------------------------------+--------+
|(500) dana ljubavi                                                        |500 Days of Summer                                     |426857  |
|(500) dana ljubavi                                                        |(500) Days of Summer                                   |426857  |
|(Ne)Profesionalac                                                         |The Brothers Grimsby                                   |77232   |
|(Ne)Profesionalac                                                         |Brothers Grimsby                                       |77232   |
|10 000 prije Krista                                                       |10,000 BC                                              |117475  |
|10 razloga zašto te mrzim                                                 |10 Things I Hate About You                             |258093  |
|10 stvari ili manje                                                       |10 Items or Less                                       |13592   |
|100 milijuna G.P.K.                                                       |100 Million BC                                         |4106    |
|100 milijuna G.P.K.                                                       |Prehistoric                                            |4106    |
|100 stvari koje moraš učiniti prije srednje škole                         |100 Things to Do Before High School                    |727     |
|101 dalmatinac                                                            |101 Dalmatians                                         |87518   |
|101 dalmatinac                                                            |101 Dalmatians                                         |130778  |
|101 dalmatinac                                                            |Walt Disney's 101 Dalmatians                           |130778  |
|101 dalmatinac                                                            |101 Dalmatians                                         |130778  |
|101 dalmatinac 2: Patchova avantura                                       |101 Dalmatians 2: Patch's London Adventure             |5990    |
|101 dalmatinac 2: Patchova avantura                                       |101 Dalmatians: The Animated Sequel                    |5990    |
|101 dalmatinac 2: Patchova avantura                                       |101 Dalmatians II: Patch's London Adventure            |5990    |
|102 dalmatinca                                                            |102 Dalmatians                                         |30293   |
|12 Hrabrih                                                                |12 Strong                                              |36833   |
|12 Hrabrih                                                                |Horse Soldiers                                         |36833   |
|12 godina ropstva                                                         |Twelve Years a Slave                                   |548225  |
|12 godina ropstva                                                         |12 Years a Slave                                       |548225  |
|12 ljutih muškaraca                                                       |12 Angry Men                                           |557187  |
|12 ljutih muškaraca                                                       |Twelve Angry Men                                       |557187  |
|12 majmuna                                                                |Twelve Monkeys                                         |526607  |
|12 majmuna                                                                |12 Monkeys                                             |526607  |
|127 sati                                                                  |127 Hours                                              |312814  |
|12:08 Istocno od Bukuresta                                                |12:08 East of Bucharest                                |6352    |
|13 grijeha                                                                |13 Sins                                                |28162   |
|13 grijeha                                                                |13: Game of Death                                      |28162   |
|13 sati: Tajni vojnici Benghazija                                         |13 Hours                                               |96369   |
|13 sati: Tajni vojnici Benghazija                                         |13 Hours: The Secret Soldiers of Benghazi              |96369   |
|15 minuta                                                                 |Fifteen Minutes                                        |45606   |
|15 minuta                                                                 |15 Minutes                                             |45606   |
|16 blokova                                                                |16 Blocks                                              |119635  |
|16 blokova                                                                |Sixteen Blocks                                         |119635  |
|2 dana u Parizu                                                           |2 Days in Paris                                        |28609   |
|2 igrača                                                                  |2 Guns                                                 |176077  |
|2 igrača                                                                  |Two Guns                                               |176077  |
|20.000 milja pod morem                                                    |Jules Verne's 20000 Leagues Under the Sea              |25089   |
|20.000 milja pod morem                                                    |Walt Disney's 20,000 Leagues Under the Sea             |25089   |
|20.000 milja pod morem                                                    |20,000 Leagues Under the Sea                           |25089   |
|2001: Odiseja u svemiru                                                   |Two Thousand and One: A Space Odyssey                  |514253  |
|2001: Odiseja u svemiru                                                   |How the Solar System Was Won                           |514253  |
|2001: Odiseja u svemiru                                                   |Journey Beyond the Stars                               |514253  |
|2012                                                                      |2012                                                   |317121  |
|2012                                                                      |Farewell Atlantis                                      |317121  |
|2012                                                                      |2012: An IMAX Experience 3D                            |317121  |
|2012: Sudnji Dan                                                          |2012 Doomsday                                          |6874    |
|21 gram                                                                   |21 Grams                                               |207310  |
|24. dan                                                                   |The 24th Day                                           |3307    |
|24: Novi dan                                                              |24: Live Another Day                                   |40183   |
|24: Novi dan                                                              |24: The Movie                                          |40183   |
|25. sat                                                                   |25th Hour                                              |159944  |
|25. sat                                                                   |The 25th Hour                                          |159944  |
|3 Ninje                                                                   |3 Ninjas                                               |18209   |
|3 dana za ubojstvo                                                        |3 Days to Kill                                         |78769   |
|30 dana noći                                                              |30 Days of Night                                       |152090  |
|300 - Bitka kod Termopila                                                 |300                                                    |671485  |
|300 - Bitka kod Termopila                                                 |300: The IMAX Experience                               |671485  |
|300: Uspon carstva                                                        |300 2                                                  |253611  |
|300: Uspon carstva                                                        |Xerxes                                                 |253611  |
|300: Uspon carstva                                                        |Untitled 300 Sequel                                    |253611  |
|300: Uspon carstva                                                        |300: Rise of an Empire                                 |253611  |
|300: Uspon carstva                                                        |300: Battle of Artemisium                              |253611  |
|4 mjeseca, 3 tjedna i 2 dana                                              |4 Months, 3 Weeks and 2 Days                           |50471   |
|40 dana bez komada                                                        |40 Days and 40 Nights                                  |65877   |
|4400                                                                      |The 4400                                               |39292   |
|47 ronina                                                                 |47 Ronin                                               |131152  |
|476 A.D. Prvo poglavlje: Zadnje svjetlo ovna                              |Chapter One: The Last Light of Aries                   |185     |
|476 A.D. Prvo poglavlje: Zadnje svjetlo ovna                              |476 A.D.                                               |185     |
|48 sati                                                                   |Forty Eight Hours                                      |60459   |
|48 sati                                                                   |48 Hours                                               |60459   |
|48 sati                                                                   |48 Hrs.                                                |60459   |
|50 prvih poljubaca                                                        |50 First Dates                                         |294752  |
|50 prvih poljubaca                                                        |Fifty First Kisses                                     |294752  |
|50 prvih poljubaca                                                        |Fifty First Dates                                      |294752  |
|6 Stepena Pakla                                                           |6 Degrees of Hell                                      |569     |
|7 Dana straha                                                             |7 Days in Entebbe                                      |6549    |
|7 Sindbadovih avantura                                                    |The Seven Voyages of Sinbad                            |1187    |
|7 Sindbadovih avantura                                                    |The 7 Adventures of Sinbad                             |1187    |
|7 zaušnica                                                                |Seven Slaps                                            |16      |
|8 jednostavnih pravila za dečke moje kćeri tinejdžerice                   |8 Simple Rules                                         |22145   |
|8 jednostavnih pravila za dečke moje kćeri tinejdžerice                   |A Few Simple Rules                                     |22145   |
|8 milja                                                                   |8 Mile                                                 |217808  |
|8 milja                                                                   |Fight Song                                             |217808  |
|8 milja                                                                   |Untitled Detroit Project                               |217808  |
|8 milja                                                                   |Fight Music                                            |217808  |
|88 minuta                                                                 |88: 88 Minutes                                         |70321   |
|88 minuta                                                                 |88 Minutes                                             |70321   |
|88 minuta                                                                 |88                                                     |70321   |
|9. ozujak                                                                 |March 9th                                              |41      |
|9. Život Louisa Draxa                                                     |The Ninth Life of Louis Drax                           |11036   |
|96 sati: Istanbul                                                         |Taken 2                                                |264880  |
|A sada, Boom                                                              |Here Comes the Boom                                    |80215   |
|A-Team                                                                    |The A-Team                                             |229749  |
|Aban i Khorshid                                                           |Aban and Khorshid                                      |334     |
|Abeceda Smrti                                                             |The ABCs of Death                                      |16362   |
|Abraham Lincoln: Lovac na vampire                                         |Abraham Lincoln: Vampire Hunter                        |139349  |
|Ace Ventura: Kad priroda zove                                             |Ace Ventura, Pet Detective: The Curse of the Wakiki    |180900  |
|Ace Ventura: Kad priroda zove                                             |Ace Ventura: When Nature Calls                         |180900  |
|Ace Ventura: Kad priroda zove                                             |Ace Ventura Goes to Africa                             |180900  |
|Ace Ventura: Šašavi detektiv                                              |Ace Ventura: Pet Detective                             |245230  |
|Adaptacija                                                                |Adaptation.                                            |160431  |
|Adaptacija                                                                |The Orchid Thief                                       |160431  |
|Adelin život                                                              |Blue Is the Warmest Color                              |117401  |
|Afera Nataše Rogin                                                        |The Meddler                                            |100     |
|Afera Nataše Rogin                                                        |Heart of Paris                                         |100     |
|Afera Thomasa Crowna                                                      |The Thomas Crown Affair                                |19392   |
|Afera Thomasa Crowna                                                      |Thomas Crown and Company                               |19392   |
|Afera Thomasa Crowna                                                      |The Crown Caper                                        |19392   |
|Afera Thomasa Crowna                                                      |Thomas Crown, Esquire                                  |19392   |
|Afera Thomasa Crowna                                                      |The Thomas Crown Affair                                |79499   |
|Agent Cody Banks                                                          |Agent Cody Banks                                       |29835   |
|Agent Cody Banks                                                          |Cody Banks                                             |29835   |
|Agent Cody Banks 2                                                        |Agent Cody Banks 2: Destination London                 |12576   |
|Agent Cody Banks 2                                                        |Agent Cody Banks 2                                     |12576   |
|Agenti S.H.I.E.L.D.-a                                                     |Marvel's Agents of S.H.I.E.L.D.                        |175288  |
|Agenti S.H.I.E.L.D.-a                                                     |Agents of S.H.I.E.L.D.: Uprising                       |175288  |
|Agenti S.H.I.E.L.D.-a                                                     |Agents of S.H.I.E.L.D.                                 |175288  |
|Agenti S.H.I.E.L.D.-a                                                     |S.H.I.E.L.D.                                           |175288  |
|Agenti S.H.I.E.L.D.-a                                                     |Agents of Shield                                       |175288  |
|Agenti S.H.I.E.L.D.-a                                                     |Marvel's S.H.I.E.L.D.                                  |175288  |
|Agenti S.H.I.E.L.D.-a                                                     |Agents of S.H.I.E.L.D.: Ghost Rider                    |175288  |
|Agonija                                                                   |Agony                                                  |48      |
|Agonija                                                                   |Rasputin                                               |1039    |
|Agonija                                                                   |Agony: The Life and Death of Rasputin                  |1039    |
|Aguirre, gnjev bozji                                                      |Aguirre, the Wrath of God                              |44529   |
|Air America                                                               |Air America                                            |24314   |
|Ajme meni                                                                 |A Coffee in Berlin                                     |12996   |
|Ako ostanem                                                               |If I Stay                                              |102355  |
|Aladin                                                                    |Aladdin                                                |304304  |
|Aladin i kralj lopova                                                     |Aladdin and the King of Thieves                        |28163   |
|Alcatraz                                                                  |Alcatraz                                               |36973   |
|Aleksandar Veliki                                                         |Alexander: Director's Cut                              |150877  |
|Aleksandar Veliki                                                         |Alexander                                              |150877  |
|Aleksandar Veliki                                                         |Alexander Revisited: The Final Cut                     |150877  |
|Aleksandar Veliki                                                         |Alexander: The Ultimate Cut                            |150877  |
|Alex i Emma                                                               |Loosely Based on a True Love Story                     |12276   |
|Alex i Emma                                                               |Alex & Emma                                            |12276   |
|Alex i Emma                                                               |The Gambler                                            |12276   |
|Alfe                                                                      |Alphas                                                 |25846   |
|Alfe                                                                      |Section 8                                              |25846   |
|Ali G u parlamentu                                                        |Ali G in da House: The Movie                           |76375   |
|Alias                                                                     |Alias                                                  |40933   |
|Alibi za ubojstvo                                                         |Her Alibi                                              |6129    |
|Alica u zemlji čuda                                                       |Alicia en el país de las maravillas                    |110796  |
|Alien protiv Predatora                                                    |Alien vs. Predator                                     |165497  |
|Alien protiv Predatora                                                    |AVP                                                    |165497  |
|Alien protiv Predatora                                                    |AVP: Alien vs. Predator                                |165497  |
|Alien protiv Predatora 2                                                  |Colorado Nights                                        |104506  |
|Alien protiv Predatora 2                                                  |Aliens vs. Predator: Requiem                           |104506  |
|Alien protiv Predatora 2                                                  |AvP2                                                   |104506  |
|Alien protiv Predatora 2                                                  |AVP: Requiem                                           |104506  |
|Alien protiv Predatora 2                                                  |Aliens vs. Predator                                    |104506  |
|Alien protiv Predatora 2                                                  |AVP: Aliens vs. Predator - Requiem                     |104506  |
|Alien protiv Predatora 2                                                  |Alien vs. Predator: Survival of the Fittest            |104506  |
|Alien: Osmi putnik                                                        |Star Beast                                             |680314  |
|Alien: Osmi putnik                                                        |Alien: The Director's Cut                              |680314  |
|Alien: Savez                                                              |Alien: Covenant                                        |207942  |
|Alien: Savez                                                              |Prometheus 2                                           |207942  |
|Alien: Savez                                                              |Alien: Paradise Lost                                   |207942  |
|Alien: Uskrsnuće                                                          |Alien 4                                                |202174  |
|Alien: Uskrsnuće                                                          |Alien: Resurrection                                    |202174  |
|Alisa iza ogledala                                                        |Into the Looking Glass                                 |72961   |
|Alisa iza ogledala                                                        |Alice Through the Looking Glass                        |72961   |
|Alisa iza ogledala                                                        |Alice in Wonderland 2                                  |72961   |
|Alisa iza ogledala                                                        |Alice in Wonderland: Through the Looking Glass         |72961   |
|Alisa u zemlji čudesa                                                     |Alice in Wonderland: An IMAX 3D Experience             |345628  |
|Alisa u zemlji čudesa                                                     |Alice in Wonderland                                    |345628  |
|Alisa u zemlji čudesa                                                     |Alice                                                  |345628  |
|All Eyez on Me: Legenda o Tupacu Shakuru                                  |All Eyez on Me                                         |16748   |
|Alvin i vjeverice                                                         |Alvin and the Chipmunks                                |66093   |
|Alvin i vjeverice                                                         |Hairy Beast                                            |66093   |
|Alvin i vjeverice                                                         |Simon                                                  |66093   |
|Alvin i vjeverice 3                                                       |Alvin and the Chipmunks 3D                             |26703   |
|Alvin i vjeverice 3                                                       |Alvin and the Chipmunks 3: Chipwrecked                 |26703   |
|Alvin i vjeverice 3                                                       |Alvin and the Chipmunks: Chipwrecked                   |26703   |
|Alvin i vjeverice: Velika alvintura                                       |Alvin and the Chipmunks: The Road Chip                 |13478   |
|Amelie                                                                    |Amélie                                                 |625757  |
|Americka himna                                                            |An American Carol                                      |8985    |
|Americka pita na Haroldov i Kumarov nacin                                 |Harold & Kumar Go to White Castle                      |168291  |
|Americka prica                                                            |An American Tail                                       |43061   |
|Amerikanac                                                                |The American                                           |85289   |
|Amerikanac                                                                |A Very Private Gentleman                               |85289   |
|Amerikanac u Parizu                                                       |An American in Paris                                   |26146   |
|Amerikanci                                                                |The Americans                                          |66464   |
|Američka horor priča                                                      |American Horror Story: Cult                            |233675  |
|Američka horor priča                                                      |American Horror Story: Apocalypse                      |233675  |
|Američka horor priča                                                      |American Horror Story: Murder House                    |233675  |
|Američka horor priča                                                      |American Horror Story: Hotel                           |233675  |
|Američka horor priča                                                      |American Horror Story: Asylum                          |233675  |
|Američka horor priča                                                      |American Horror Story: Coven                           |233675  |
|Američka horor priča                                                      |American Horror Story: Roanoke                         |233675  |
|Američka horor priča                                                      |American Horror Story                                  |233675  |
|Američka horor priča                                                      |American Horror Story: Freak Show                      |233675  |
|Američka noć                                                              |Day for Night                                          |16987   |
|Američka pita                                                             |East Great Falls High                                  |343382  |
|Američka pita                                                             |Great Falls                                            |343382  |
|Američka pita                                                             |American Pie                                           |343382  |
|Američka pita 2                                                           |Secret Disguise                                        |219177  |
|Američka pita 2                                                           |American Pie 2                                         |219177  |
|Američka pita 3: Vjenčanje                                                |American Pie 3                                         |177714  |
|Američka pita 3: Vjenčanje                                                |American Wedding                                       |177714  |
|Američka pita 3: Vjenčanje                                                |American Pie 3: Piece of Pie                           |177714  |
|Američka pita: Bratstvo Beta                                              |American Pie Presents: Beta House                      |55090   |
|Američka pita: Bratstvo Beta                                              |American Pie 6: Beta House                             |55090   |
|Američka pita: Bratstvo Beta                                              |American Pie Presents Beta House                       |55090   |
|Američka pita: Gola milja                                                 |American Pie 5: The Naked Mile                         |58568   |
|Američka pita: Gola milja                                                 |American Pie Presents: The Naked Mile                  |58568   |
|Američka pita: Gola milja                                                 |American Pie Presents The Naked Mile                   |58568   |
|Američka pita: Knjiga ljubavi                                             |American Pie 7: The Book of Love                       |38717   |
|Američka pita: Knjiga ljubavi                                             |American Pie Presents: The Book of Love                |38717   |
|Američka pita: Okupljanje                                                 |American Reunion                                       |187305  |
|Američka pita: Okupljanje                                                 |American Pie 4                                         |187305  |
|Američka pita: Svirački kamp                                              |American Pie 4: Band Camp                              |61386   |
|Američka pita: Svirački kamp                                              |American Pie Presents Band Camp                        |61386   |
|Američka pita: Svirački kamp                                              |American Pie Presents: Band Camp                       |61386   |
|Američki gangster                                                         |Tru Blu                                                |355268  |
|Američki gangster                                                         |American Gangster                                      |355268  |
|Američki gangster                                                         |The Return of Superfly                                 |355268  |
|Američki grafiti                                                          |Another Slow Night in Modesto                          |72027   |
|Američki grafiti                                                          |American Graffiti                                      |72027   |
|Američki odmetnici                                                        |Jesse James                                            |12952   |
|Američki odmetnici                                                        |American Outlaws                                       |12952   |
|Američki plaćenik                                                         |American Assassin                                      |50066   |
|Američki psiho                                                            |American Psycho                                        |412461  |
|Američki snajper                                                          |American Sniper                                        |383773  |
|Američki varalice                                                         |American Hustle                                        |403863  |
|Američki varalice                                                         |American Bullshit                                      |403863  |
|Američki žigolo                                                           |An American Gigolo                                     |18458   |
|Američki žigolo                                                           |American Gigolo                                        |18458   |
|Amityville horor                                                          |The Amityville Horror                                  |95635   |
|Amsterdamsko klanje                                                       |Amsterdamned                                           |6024    |
|Anabela 2                                                                 |Annabelle: Creation                                    |76288   |
|Analiziraj ono                                                            |Analyze That                                           |76016   |
|Analiziraj ono                                                            |Analyze This 2                                         |76016   |
|Analiziraj ovo                                                            |Analyze This                                           |134630  |
|Anamorf                                                                   |Anamorph                                               |8518    |
|Anastazija                                                                |Anastasia                                              |99323   |
|Anastazija                                                                |The Music Box                                          |99323   |
|Anatomija pakla                                                           |Anatomy of Hell                                        |4497    |
|Andaluzijski pas                                                          |Un Chien Andalou                                       |40156   |
|Andaluzijski pas                                                          |Un Chien Andalou                                       |40156   |
|Andaluzijski pas                                                          |An Andalusian Dog                                      |40156   |
|Andjeli i demoni                                                          |Frailty                                                |68830   |
|Andjeli i djevice                                                         |Decameron: Angels & Virgins                            |7058    |
|Andjeli i djevice                                                         |Chasing Temptation                                     |7058    |
|Andjeli i djevice                                                         |Guilty Pleasures                                       |7058    |
|Andjeli i djevice                                                         |Angels and Virgins                                     |7058    |
|Andjeo i vrag                                                             |Falling Angel                                          |316     |
|Andjeo i vrag                                                             |Más sabe el diablo                                     |316     |
|Andron - Crni labirint                                                    |Andron                                                 |2508    |
|Angie                                                                     |Angie                                                  |1892    |
|Animanijaci                                                               |Steven Spielberg Presents Animaniacs                   |18431   |
|Animanijaci                                                               |Animaniacs                                             |18431   |
|Anna i kralj                                                              |Anna and the King                                      |33436   |
|Anna i kralj                                                              |Anna                                                   |33436   |
|Annabelle: Početak                                                        |Annabelle: Creation                                    |76288   |
|Annie Hall                                                                |Annie Hall                                             |230236  |
|Annie Hall                                                                |It Had to be Jew                                       |230236  |
|Annie Hall                                                                |Anhedonia                                              |230236  |
|Anđeli i demoni                                                           |Obelisk                                                |243558  |
|Anđeli i demoni                                                           |Angels & Demons                                        |243558  |
|Anđeli na terenu                                                          |Angels in the Outfield                                 |25359   |
|Anđeo ljubavi                                                             |3 Smart Girls Grow Up                                  |254     |
|Anđeo ljubavi                                                             |Three Smart Girls Grow Up                              |254     |
|Anđeo tame                                                                |James Cameron's Dark Angel                             |27966   |
|Anđeo tame                                                                |Dark Angel                                             |27966   |
|Anđeoske oči                                                              |Ojos de ángel                                          |20779   |
|Anđeoske oči                                                              |Heart of Town                                          |20779   |
|Apartman                                                                  |The Apartment                                          |135311  |
|Apokalipsa                                                                |The Apocalypse                                         |2553    |
|Apokalipsa danas                                                          |Apocalypse Now                                         |523751  |
|Apokalipsa danas                                                          |Apocalypse Now: The Complete Dossier                   |523751  |
|Appaloosa                                                                 |Appaloosa                                              |54378   |
|Argo                                                                      |Escape from Tehran                                     |516859  |
|Argo                                                                      |Argo                                                   |516859  |
|Arizona Dream                                                             |Arizona Dream                                          |37556   |
|Arizona Dream                                                             |American Dreamers                                      |37556   |
|Arizona Dream                                                             |The Arrowtooth Waltz                                   |37556   |
|Arizona Junior                                                            |Raising Arizona                                        |112335  |
|Arktik 3D                                                                 |To the Arctic 3D                                       |995     |
|Arktik 3D IMAX                                                            |To the Arctic 3D                                       |995     |
|Armagedon                                                                 |Armageddon                                             |358375  |
|Armored                                                                   |Armored                                                |28016   |
|Arthur 3: Rat dvaju svjetova                                              |Arthur and the Two Worlds War                          |6774    |
|Arthur Božić                                                              |Arthur Christmas in 3D                                 |42604   |
|Arthur u zemlji Minimoya                                                  |Arthur and the Invisibles                              |29206   |
|As asova                                                                  |Ace of Aces                                            |2551    |
|Asterix i Obelix protiv Cezara                                            |Asterix and Obelix vs. Caesar                          |34826   |
|Asterix i Obelix u Britaniji                                              |Astérix and Obélix: God Save Britannia                 |11078   |
|Asterix i Obelix: Misija Kleopatra                                        |Asterix & Obelix: Mission Cleopatra                    |42851   |
|Asterix i Obelix: Misija Kleopatra                                        |Asterix and Obelix Meet Cleopatra                      |42851   |
|Astralna Podmuklost: Poglavlje 4                                          |Insidious: Chapter 4                                   |32690   |
|Astralna Podmuklost: Poslednji Ključ                                      |Insidious: Chapter 4                                   |32690   |
|Astralna podmuklost: Poglavlje 3                                          |Insidious 3                                            |76694   |
|Astronautova zena                                                         |The Astronaut's Wife                                   |49466   |
|Atentat na predsjednika gimnazije                                         |Assassination of a High School President               |14825   |
|Atentat na predsjednika gimnazije                                         |The Sophomore                                          |14825   |
|Atlanta                                                                   |Atlanta: Robbin' Season                                |32931   |
|Atlanta                                                                   |Atlanta                                                |32931   |
|Atlantida: Izgubljeno carstvo                                             |Atlantis                                               |87618   |
|Atlantida: Izgubljeno carstvo                                             |Atlantis: The Lost Empire                              |87618   |
|Atlantida: Milov povratak                                                 |Atlantis: Milo's Return                                |6529    |
|Atlas oblaka                                                              |Cloud Atlas                                            |317546  |
|Atomska bomba nad Hirošimom                                               |Children of Hiroshima                                  |814     |
|Atomska plavuša                                                           |The Coldest City                                       |133785  |
|Audrey Hepburn: Diva za sva vremena                                       |Audrey Hepburn                                         |2257    |
|Audrey Hepburn: Diva za sva vremena                                       |The Audrey Hepburn Story                               |2257    |
|Audrey Hepburn: Diva za sva vremena                                       |Untitled Audrey Hepburn Bio                            |2257    |
|Aurora                                                                    |Aurora                                                 |153     |
|Austin Powers 2: Špijun koji me hvatao                                    |Austin Powers 2: The Spy Who Shagged Me                |197865  |
|Austin Powers 2: Špijun koji me hvatao                                    |The Return of Dr. Evil                                 |197865  |
|Austin Powers 2: Špijun koji me hvatao                                    |Austin Powers 2                                        |197865  |
|Austin Powers 2: Špijun koji me hvatao                                    |Austin Powers: The Spy Who Shagged Me                  |197865  |
|Austin Powers 2: Špijun koji me hvatao                                    |It's Shagging Time                                     |197865  |
|Austin Powers 2: Špijun koji me hvatao                                    |Austin Powers 2: It's Shagging Time                    |197865  |
|Austin Powers u Goldmemberu                                               |Austin Powers 3                                        |178382  |
|Austin Powers u Goldmemberu                                               |Austin Powers: Goldmember                              |178382  |
|Austin Powers u Goldmemberu                                               |Austin Powers in Goldmember                            |178382  |
|Austin Powers u Goldmemberu                                               |Austinpussy                                            |178382  |
|Austin Powers u Goldmemberu                                               |Austin Powers: Never Say Member Again                  |178382  |
|Austin Powers u Goldmemberu                                               |The Third Installment of 'Austin Powers'               |178382  |
|Austin Powers u Goldmemberu                                               |The Next Installment of Austin Powers                  |178382  |
|Austin Powers: Tajanstveni tajni agent                                    |Austin Powers: International Man of Mystery            |200294  |
|Austin Powers: Tajanstveni tajni agent                                    |Austin Powers                                          |200294  |
|Auti                                                                      |The Yellow Car                                         |309636  |
|Auti                                                                      |Route 66                                               |309636  |
|Auti                                                                      |The Cars                                               |309636  |
|Auti                                                                      |Cars                                                   |309636  |
|Auti 2                                                                    |Cars 2                                                 |128032  |
|Auti 2 3D IMAX                                                            |Cars 2                                                 |128032  |
|Auti 3                                                                    |Cars 3                                                 |50016   |
|Auto 54, gdje ste?                                                        |Car 54, Where Are You?                                 |4082    |
|Autocesta bez izlaza                                                      |Freeway                                                |24020   |
|Automatik                                                                 |Automatic                                              |661     |
|Automatik: Savršeno oružje                                                |Automatic                                              |661     |
|Automobil za patuljke                                                     |The Gnome-Mobile                                       |1704    |
|Autostoper                                                                |The Hitcher                                            |37684   |
|Avantura                                                                  |L'Avventura                                            |21720   |
|Avanture Tintina                                                          |The Adventures of Tintin                               |196420  |
|Avanture Tintina                                                          |The Adventures of Tintin: The Secret of the Unicorn    |196420  |
|Avanture carobnog kamena                                                  |Shorts                                                 |6018    |
|Avanture carobnog kamena                                                  |Shorts: The Adventures of the Wishing Rock             |6018    |
|Avanture dječaka Flapjacka                                                |The Marvelous Misadventures of Flapjack                |8384    |
|Avanture dječaka Flapjacka                                                |Flapjack                                               |8384    |
|Avanture male Chihiro                                                     |Miyazaki's Spirited Away                               |522737  |
|Avanture male Chihiro                                                     |Spirited Away                                          |522737  |
|Avatar                                                                    |Avatar: An IMAX 3D Experience                          |1000872 |
|Avatar                                                                    |Avatar: Special Edition                                |1000872 |
|Avatar                                                                    |James Cameron's Avatar                                 |1000872 |
|Avatar                                                                    |Project 880                                            |1000872 |
|Avatar: Legenda o Korri                                                   |La leyenda de Korra                                    |80336   |
|Avatar: Legenda o Korri                                                   |The Last Airbender: The Legend of Korra                |80336   |
|Avatar: Legenda o Korri                                                   |The Legend of Korra                                    |80336   |
|Avatar: Legenda o Korri                                                   |The Legend of Korra                                    |80336   |
|Avatar: Posljednji gospodar vjetrova                                      |Avatar: The Last Airbender                             |173442  |
|Avatar: Posljednji gospodar vjetrova                                      |Nickelodeon Avatar: The Last Airbender                 |173442  |
|Ave, Cezare!                                                              |Hail, Caesar! A Tale of The Christ                     |105114  |
|Avioni                                                                    |World of Cars: Planes                                  |38768   |
|Avioni                                                                    |Disney's Planes                                        |38768   |
|Avioni                                                                    |Planes                                                 |38768   |
|Avioni 2: Nebeski vatrogasci                                              |Planes 2: Fire & Rescue                                |14636   |
|Avioni 2: Nebeski vatrogasci                                              |Planes: Fire & Rescue                                  |14636   |
|Avioni 2: Nebeski vatrogasci                                              |Planes 2                                               |14636   |
|Avioni, vlakovi i automobili                                              |Planes, Trains and Automobiles                         |104885  |
|Avioni, vlakovi i automobili                                              |Planes, Trains & Automobiles                           |104885  |
|BFG Blagi Fantasticni Gorostas                                            |The Big Friendly Giant                                 |64804   |
|BFG Blagi Fantasticni Gorostas                                            |Roald Dahl's The BFG                                   |64804   |
|BFG Blagi Fantasticni Gorostas                                            |The BFG                                                |64804   |
|BFG Blagi Fantasticni Gorostas                                            |Big Valley                                             |64804   |
|BMX banditi                                                               |Short Wave                                             |4120    |
|Babe: Praščić u gradu                                                     |Babe 2                                                 |28246   |
|Babe: Praščić u gradu                                                     |Babe in Metropolis                                     |28246   |
|Babydoll uzvraća udarac                                                   |Sucker Punch: The IMAX Experience                      |213795  |
|Babydoll uzvraća udarac                                                   |Sucker Punch                                           |213795  |
|Bagra                                                                     |The Flock                                              |10411   |
|Bajazzo                                                                   |A Clown Must Laugh                                     |14      |
|Bajum Badum                                                               |Lineman                                                |1571    |
|Bal čudovišta                                                             |Monster's Ball                                         |76891   |
|Balada o Nessie                                                           |The Ballad of Nessie                                   |1288    |
|Balerina i Viktor                                                         |Leap!                                                  |14739   |
|Ballistic                                                                 |Ecks vs. Sever                                         |17763   |
|Ballistic                                                                 |Gunner                                                 |17763   |
|Ballistic                                                                 |Legion                                                 |17763   |
|Ballistic                                                                 |X vs. Sever                                            |17763   |
|Ballistic                                                                 |Ballistic: Ecks vs. Sever                              |17763   |
|Balto                                                                     |Balto                                                  |34942   |
|Balto 2: Vučja potraga                                                    |Balto: Wolf Quest                                      |3566    |
|Balto 3: Na krilima promjene                                              |Balto III: Wings of Change                             |2255    |
|Balto 3: Na krilima promjene                                              |Balto: Wings of Change                                 |2255    |
|Bambi                                                                     |Walt Disney's Bambi                                    |111241  |
|Bambi                                                                     |Bambi                                                  |111241  |
|Bambi 2                                                                   |Bambi II                                               |7814    |
|Bambi 2                                                                   |Bambi and the Great Prince of the Forest               |7814    |
|Banda iz pješčanika                                                       |The Sandlot                                            |68079   |
|Banda iz pješčanika 2                                                     |The Sandlot 2                                          |4224    |
|Banda iz pješčanika 3                                                     |The Sandlot: Heading Home                              |1594    |
|Bande New Yorka                                                           |Gangs of New York                                      |358163  |
|Banditi                                                                   |Outlaws                                                |61104   |
|Banditi                                                                   |Bandits                                                |61104   |
|Banditi divljeg zapada                                                    |Land Beyond the Law                                    |74      |
|Banket                                                                    |Legend of the Black Scorpion                           |6211    |
|Bankomat                                                                  |ATM                                                    |21009   |
|Barbarske invazije                                                        |The Barbarian Invasions                                |26502   |
|Barbi skola za princeze                                                   |Barbie: Princess Charm School                          |1424    |
|Barbie Fairytopia 2: Sirenija                                             |Barbie Fairytopia: Mermaidia                           |1842    |
|Barbie i dijamantni dvorac                                                |Barbie and the Diamond Castle                          |1639    |
|Barbie kao Matovilka                                                      |Barbie as Rapunzel                                     |3952    |
|Barbie na labuđem jezeru                                                  |Barbie of Swan Lake                                    |3489    |
|Barbie u 12 Rasplesanih Princeza                                          |Barbie in the 12 Dancing Princesses                    |2528    |
|Barbie u Krcko Oraščiću                                                   |Barbie in the Nutcracker                               |3992    |
|Barbie u priči o sireni                                                   |Barbie in a Mermaid Tale                               |1498    |
|Barquero                                                                  |Barquero                                               |1148    |
|Bartok Veličanstveni                                                      |Bartok the Magnificent                                 |2005    |
|Bas kao tata                                                              |Just Like Dad                                          |393     |
|Batler                                                                    |Lee Daniels' The Butler                                |99420   |
|Batman                                                                    |Batman                                                 |302020  |
|Batman i Robin                                                            |Batman 4                                               |210788  |
|Batman i Robin                                                            |Batman and Robin                                       |210788  |
|Batman i Robin                                                            |Batman & Robin                                         |210788  |
|Batman se vraća                                                           |Batman 2                                               |243447  |
|Batman se vraća                                                           |Batman Returns                                         |243447  |
|Batman v Superman: Zora pravednika                                        |Batman vs. Superman                                    |545128  |
|Batman v Superman: Zora pravednika                                        |Batman versus Superman: Dawn of Justice                |545128  |
|Batman v Superman: Zora pravednika                                        |Batman v Superman: Dawn of Justice                     |545128  |
|Batman v Superman: Zora pravednika                                        |Dawn of Justice                                        |545128  |
|Batman zauvijek                                                           |Forever                                                |212969  |
|Batman zauvijek                                                           |Batman 3                                               |212969  |
|Batman zauvijek                                                           |Batman Forever                                         |212969  |
|Batman: Početak                                                           |Batman Begins: The IMAX Experience                     |1142229 |
|Batman: Početak                                                           |Batman Begins                                          |1142229 |
|Batman: Početak                                                           |Batman 5                                               |1142229 |
|Batman: Početak                                                           |The Intimidation Game                                  |1142229 |
|Batman: Početak                                                           |Batman: Intimidation                                   |1142229 |
|Baš kao ona                                                               |In Her Shoes                                           |55639   |
|Bean... film vrhunske katastrofe                                          |Bean: The Movie                                        |85692   |
|Bebin tata                                                                |Baby Daddy                                             |17239   |
|Becker                                                                    |Becker                                                 |10423   |
|Beethoven 2                                                               |Beethoven's 2nd                                        |22351   |
|Beethoven 3                                                               |Beethoven's 3rd                                        |4493    |
|Beethoven 4                                                               |Beethoven's 4th                                        |3149    |
|Beethoven 5                                                               |Beethoven's 5th: Big Paw                               |2543    |
|Beethoven 5                                                               |Beethoven's 5th                                        |2543    |
|Beethoven 5                                                               |Big Paw: Beethoven 5                                   |2543    |
|Beethovenova božićna avantura                                             |Beethoven's Christmas Adventure                        |965     |
|Beethovenova velika avantura                                              |Beethoven's 6th                                        |1717    |
|Beethovenova velika avantura                                              |Beethoven: The Reel Story                              |1717    |
|Beethovenova velika avantura                                              |Beethoven's Big Break                                  |1717    |
|Bella i Buldozi                                                           |Bella and the Bulldogs                                 |1183    |
|Bella i Buldozi                                                           |Bella and the Bullfrogs                                |1183    |
|Ben 10                                                                    |Ben 10                                                 |8731    |
|Ben Hur                                                                   |Ben-Hur: A Tale of the Christ                          |193492  |
|Ben Hur                                                                   |Ben-Hur                                                |193492  |
|Ben Hur                                                                   |William Wyler's Ben-Hur                                |193492  |
|Ben i ja                                                                  |Ben and Me                                             |641     |
|Bengali                                                                   |The Lives of a Bengal Lancer                           |2247    |
|Bengali                                                                   |More Lives of a Bengal Lancer                          |2247    |
|Benny i Joon                                                              |Benny & Joon                                           |50357   |
|Berserk                                                                   |Berserk                                                |22041   |
|Beskrajna ljubav                                                          |Endless Love                                           |36551   |
|Beskrajni dan                                                             |Groundhog Day                                          |518816  |
|Besmrtna pjesma (Tiha noć... sveta noć)                                   |Silent Night                                           |7       |
|Besmrtnici                                                                |War of Gods                                            |149574  |
|Besmrtnici                                                                |Immortals 3D                                           |149574  |
|Besmrtnici                                                                |Immortals                                              |149574  |
|Besmrtnik                                                                 |Immortal                                               |19379   |
|Besmrtno oruzje                                                           |Loaded Weapon 1                                        |40737   |
|Besmrtno oruzje                                                           |National Lampoon's Loaded Weapon 1                     |40737   |
|Besmrtno oružje                                                           |Loaded Weapon 1                                        |40737   |
|Besmrtno oružje                                                           |National Lampoon's Loaded Weapon 1                     |40737   |
|Besramnici                                                                |Shameless                                              |154733  |
|Betsyno vjenčanje                                                         |Three Daughters                                        |3049    |
|Betsyno vjenčanje                                                         |Betsy's Wedding                                        |3049    |
|Beverly Hills                                                             |Beverly Hills, 90210                                   |26470   |
|Beverly Hills                                                             |Class of Beverly Hills                                 |26470   |
|Bez Muskarca                                                              |Without Men                                            |1551    |
|Bez imena                                                                 |Sin Nombre                                             |28635   |
|Bez izlaza                                                                |Deceit                                                 |30502   |
|Bez izlaza                                                                |No Way Out                                             |30502   |
|Bez kormila                                                               |Rudderless                                             |15703   |
|Bez oduševljenja, molim                                                   |Curb Your Enthusiasm                                   |81091   |
|Bez povratka                                                              |No Way Back                                            |2138    |
|Bez traga                                                                 |W.A.T                                                  |16191   |
|Bez traga                                                                 |Vanished                                               |16191   |
|Bez traga                                                                 |Without a Trace                                        |16191   |
|Bez ugriza, molim                                                         |L.A. Art Show                                          |42608   |
|Bez ugriza, molim                                                         |Untitled Vampire Spoof                                 |42608   |
|Bez ugriza, molim                                                         |Vampires Suck                                          |42608   |
|Bez vijesti od Boga                                                       |Bendito Infierno (Don't Tempt Me)                      |5050    |
|Bez vijesti od Boga                                                       |Don't Tempt Me                                         |5050    |
|Bez vijesti od Boga                                                       |No News from God                                       |5050    |
|Bez zakona                                                                |Lawless                                                |207545  |
|Bez zakona                                                                |The Wettest County                                     |207545  |
|Bez zakona                                                                |The Promised Land                                      |207545  |
|Bez zakona                                                                |The Wettest County in the World                        |207545  |
|Bezdan                                                                    |The Abyss                                              |146798  |
|Bezvremeni                                                                |Timeless                                               |26444   |
|Bezvremenska Adaline                                                      |Adaline                                                |129921  |
|Bezvremenska Adaline                                                      |The Age of Adaline                                     |129921  |
|Bijeg                                                                     |Getaway                                                |21584   |
|Bijeg                                                                     |The Getaway                                            |15455   |
|Bijeg                                                                     |The Getaway                                            |24246   |
|Bijeg iz Alcatraza                                                        |Escape from Alcatraz                                   |99869   |
|Bijeg iz Gulaga                                                           |The Way Back                                           |98954   |
|Bijeg iz Los Angelesa                                                     |Escape from L.A.                                       |61491   |
|Bijeg iz Los Angelesa                                                     |John Carpenter's Escape from L.A.                      |61491   |
|Bijeg iz New Yorka                                                        |Escape from New York City                              |106746  |
|Bijeg iz New Yorka                                                        |John Carpenter's Escape from New York                  |106746  |
|Bijeg iz tvrdjave (Špijun broj 33)                                        |Lancer Spy                                             |112     |
|Bijeg s planeta Zemlje                                                    |Escape from Planet Earth                               |22653   |
|Bijeg s planeta majmuna                                                   |Secret of the Planet of the Apes                       |28182   |
|Bijeg s planeta majmuna                                                   |Escape from the Planet of the Apes                     |28182   |
|Bijeg u pobjedu                                                           |Escape to Victory                                      |24083   |
|Bijeg u pobjedu                                                           |Victory                                                |24083   |
|Bijeg u zoru                                                              |Rescue Dawn                                            |92677   |
|Bijele sjene                                                              |White Shadows in the South Seas                        |638     |
|Bijeli balon                                                              |The White Balloon                                      |5705    |
|Bijeli jorgovan                                                           |Maytime                                                |858     |
|Bijeli ocnjak                                                             |White Fang                                             |17500   |
|Bijeli oleandar                                                           |White Oleander                                         |27575   |
|Bijeli prah                                                               |Blow                                                   |218082  |
|Bijeli prah                                                               |Blow: One Man's Life                                   |218082  |
|Bijes Titana                                                              |Clash of the Titans 2                                  |167599  |
|Bijes u zoru                                                              |Rage at Dawn                                           |819     |
|Bik Ferdinand                                                             |Ferdinand the Bull                                     |1956    |
|Bik Ferdinand                                                             |The Story of Ferdinand                                 |1956    |
|Bili smo vojnici                                                          |We Were Soldiers Once... and Young                     |116965  |
|Bili smo vojnici                                                          |The Lost Patrol                                        |116965  |
|Bili smo vojnici                                                          |We Were Soldiers                                       |116965  |
|Bilježnica                                                                |The Notebook                                           |453221  |
|Bilo jednom na Divljem zapadu                                             |Once Upon a Time in the West                           |258411  |
|Bilo jednom na Divljem zapadu                                             |There Was Once the West                                |258411  |
|Bilo jednom u Americi                                                     |Once Upon a Time in America                            |263118  |
|Bilo jednom u Meksiku                                                     |Once Upon a Time in Mexico                             |141522  |
|Bilo jednom u Meksiku                                                     |El Mariachi 3                                          |141522  |
|Bio jednom jedan cvor                                                     |Once Upon a Hub                                        |27      |
|Bio jednom lopov                                                          |John Woo's Once a Thief                                |1528    |
|Birdman                                                                   |Birdman or (The Unexpected Virtue of Ignorance)        |490766  |
|Biseri Koronov                                                            |Unexpected Bride                                       |555     |
|Biseri Koronov                                                            |Whipsaw                                                |555     |
|Bit će krvi                                                               |There Will Be Blood                                    |443396  |
|Bit će krvi                                                               |Oil!                                                   |443396  |
|Biti Flynn                                                                |Being Flynn                                            |15442   |
|Biti Flynn                                                                |Another Bullshit Night in Suck City                    |15442   |
|Biti Flynn                                                                |Welcome To Suck City                                   |15442   |
|Biti Flynn                                                                |Another Night                                          |15442   |
|Biti John Malkovich                                                       |Being John Malkovich                                   |280406  |
|Biti najbolji                                                             |Woody Allen Fall Project 1998                          |29934   |
|Biti najbolji                                                             |Sweet and Lowdown                                      |29934   |
|Bitka kod Crvene stijene                                                  |Red Cliff                                              |40452   |
|Bitka na Neretvi                                                          |The Battle of the River Neretva                        |2753    |
|Bitka za Božić                                                            |Deck the Halls                                         |19134   |
|Bitka za Božić                                                            |All Lit Up                                             |19134   |
|Bitka za Britaniju                                                        |The Battle of Britain                                  |18287   |
|Bitka za Pacifik                                                          |Pacific Rim                                            |431950  |
|Bitka za Pacifik                                                          |Still Seas                                             |431950  |
|Bitka za Pacifik 2                                                        |Pacific Rim: Uprising                                  |69984   |
|Bitka za Staljingrad                                                      |Stalingrad                                             |14114   |
|Bitka za Vukovar                                                          |Battle for Vukovar                                     |31      |
|Bitka za planet majmuna                                                   |Battle for the Planet of the Apes                      |26057   |
|Bivši prijatelj Kid                                                       |Pat Garrett and Billy the Kid                          |15701   |
|Bivši prijatelj Kid                                                       |Pat Garrett & Billy the Kid                            |15701   |
|Bič prošlosti                                                             |Les Misérables                                         |2912    |
|Bič prošlosti                                                             |Les Misérables                                         |2912    |
|Bjegunac                                                                  |The Fugitive                                           |237225  |
|Blackhat                                                                  |Blackhat                                               |46944   |
|Blade                                                                     |Blade                                                  |217128  |
|Blade                                                                     |Blade, the Vampire Slayer                              |217128  |
|Blade Runner 2049                                                         |Blade Runner 2049                                      |328109  |
|Blade Runner 2049                                                         |Acid Zoo                                               |328109  |
|Blade: Trojstvo                                                           |Blade: Trinity                                         |150223  |
|Blade: Trojstvo                                                           |Blade III                                              |150223  |
|Blago Sierra Madre                                                        |Treasure of Sierra Madre                               |96989   |
|Blago Sierra Madre                                                        |The Treasure of the Sierra Madre                       |96989   |
|Blaze i čudovišne mašine                                                  |Blaze and the Monster Machines                         |350     |
|Blebetanje                                                                |Jabberwock                                             |545     |
|Bledoliki konjanik                                                        |Pale Rider                                             |45574   |
|Blefer                                                                    |Lucky You                                              |19254   |
|Bling Ring                                                                |The Bling Ring                                         |75721   |
|Bliski odnosi                                                             |Closer                                                 |184902  |
|Bliski susreti treće vrste                                                |Watch the Skies                                        |160812  |
|Bliski susreti treće vrste                                                |CE3K                                                   |160812  |
|Bliski susreti treće vrste                                                |Close Encounters of the Third Kind                     |160812  |
|Bliski susreti treće vrste                                                |The Special Edition: Close Encounters of the Third Kind|160812  |
|Bliski susreti treće vrste                                                |The Close Encounter of the Third Kind                  |160812  |
|Blizanci                                                                  |The Experiment                                         |99234   |
|Blizanci                                                                  |Twiins                                                 |99234   |
|Blizanci                                                                  |Twins                                                  |99234   |
|Blizanci                                                                  |September                                              |72621   |
|Blizanci                                                                  |Untitled Oliver Stone/September 11 Project             |72621   |
|Blizanci                                                                  |World Trade Center                                     |72621   |
|Bljesak                                                                   |The Glimmer Man                                        |17058   |
|Blues crne zmije                                                          |Black Snake Moan                                       |57090   |
|Blues kaubojki                                                            |Even Cowgirls Get the Blues                            |6569    |
|Bobovi hamburgeri                                                         |Bob's Burgers                                          |51695   |
|Bog ipak postoji                                                          |God's Not Dead                                         |36863   |
|Bog ipak postoji                                                          |God's Not Dead 2                                       |9567    |
|Bog ipak postoji                                                          |God's Not Dead II                                      |9567    |
|Bog ipak postoji 2                                                        |God's Not Dead 2                                       |9567    |
|Bog ipak postoji 2                                                        |God's Not Dead II                                      |9567    |
|Boginja Konga                                                             |Congo Maisie                                           |333     |
|Bogovi Egipta                                                             |Gods of Egypt                                          |89020   |
|Boja purpura                                                              |The Color Purple                                       |68991   |
|Boja purpura                                                              |Moon Song                                              |68991   |
|Boja vremena                                                              |Tar                                                    |1156    |
|Boja vremena                                                              |The Color of Time                                      |1156    |
|Boje istine                                                               |True Colors                                            |4375    |
|Boksač                                                                    |The Fighter                                            |306501  |
|Bolero                                                                    |Bolero                                                 |4504    |
|Bolesno                                                                   |SiCKO                                                  |70455   |
|Bolesno                                                                   |Sicko                                                  |70455   |
|Bolje ne može                                                             |As Good as It Gets                                     |246577  |
|Bolje ne može                                                             |Old Friends                                            |246577  |
|Bolji život                                                               |The Gardener                                           |14293   |
|Bolji život                                                               |A Better Life                                          |14293   |
|Bolna sucut                                                               |Sympathy for Delicious                                 |1707    |
|Bonnie i Clyde                                                            |Bonnie & Clyde                                         |4562    |
|Bonnie i Clyde                                                            |Bonnie and Clyde                                       |90339   |
|Borat: Učenje o amerika kultura za boljitak veličanstveno država Kazahstan|Borat                                                  |324062  |
|Borat: Učenje o amerika kultura za boljitak veličanstveno država Kazahstan|Borat!                                                 |324062  |
|Bosonoga                                                                  |Barefoot                                               |9514    |
|Bostonsko pravo                                                           |Untitled 'The Practice' Spinoff                        |39068   |
|Bostonsko pravo                                                           |Boston Legal                                           |39068   |
|Bostonsko pravo                                                           |Fleet Street                                           |39068   |
|Bostonsko pravo                                                           |The Practice: Fleet Street                             |39068   |
|Bourneov identitet                                                        |The Bourne Identity                                    |460926  |
|Bourneov ultimatum                                                        |The Bourne Ultimatum                                   |566634  |
|Bourneova nadmoć                                                          |The Bourne Supremacy                                   |395232  |
|Bourneovo nasljeđe                                                        |Marcher                                                |260604  |
|Bourneovo nasljeđe                                                        |The Bourne Legacy                                      |260604  |
|Bozic jedne dive                                                          |A Diva's Christmas Carol                               |1002    |
|Bozic sestara March                                                       |The March Sisters at Christmas                         |380     |
|Bozic u Bostonu                                                           |Christmas in Boston                                    |1932    |
|Bozic u Connecticutu                                                      |Christmas in Connecticut                               |1116    |
|Bozicna prica                                                             |Christmas Story                                        |2889    |
|Bozicne kape                                                              |Hats Off to Christmas!                                 |1263    |
|Bozicni ukras                                                             |The Christmas Ornament                                 |1290    |
|Bože, blagoslovi Ameriku                                                  |God Bless America                                      |64815   |
|Božić na Haroldov i Kumarov način                                         |A Very Harold & Kumar 3D Christmas                     |60438   |
|Božić na Haroldov i Kumarov način                                         |Harold & Kumar 3                                       |60438   |
|Božićna priča                                                             |A Christmas Carol: An IMAX 3D Experience               |86526   |
|Božićna priča                                                             |A Christmas Carol                                      |86526   |
|Božićna priča                                                             |Disney's A Christmas Carol                             |86526   |
|Božićna priča                                                             |A Christmas Story                                      |116752  |
|Božićna priča o igračkama                                                 |Toy Story That Time Forgot                             |7257    |
|Božji grad                                                                |City of God                                            |616771  |
|Božji oklop                                                               |Armor of God                                           |14978   |
|Božji oklop                                                               |Operation Condor 2                                     |14978   |
|Braca po krvi                                                             |We Own the Night                                       |78084   |
|Bracna klopka                                                             |Buying the Cow                                         |6219    |
|Brak iz ljubavi                                                           |I Married for Love                                     |19      |
|Brak na brzaka                                                            |Fools Rush In                                          |29804   |
|Brak na talijanski način                                                  |Marriage Italian Style                                 |6548    |
|Bratstva i sestrinstva                                                    |Greek                                                  |22414   |
|Bratstvo lopova                                                           |Den of Thieves                                         |50745   |
|Braća Blues                                                               |The Blues Brothers                                     |161495  |
|Braća Blues                                                               |The Return of the Blues Brothers                       |161495  |
|Braća Blues 2000                                                          |Blues Brothers 2000                                    |28656   |
|Braća Grimm                                                               |The Brothers Grimm                                     |107752  |
|Braća i sestre                                                            |Brothers and Sisters                                   |20000   |
|Braća i sestre                                                            |Brothers & Sisters                                     |20000   |
|Braća vojnici                                                             |Enlisted                                               |4992    |
|Bračne svađe                                                              |God of Carnage                                         |107956  |
|Bračne vode                                                               |Married... with Children                               |86529   |
|Bračne vode                                                               |Not the Cosbys                                         |86529   |
|Bračne vode                                                               |Married with Children                                  |86529   |
|Brda imaju oči                                                            |The Hills Have Eyes                                    |144704  |
|Brda imaju oči 2                                                          |The Hills Have Eyes 2                                  |55388   |
|Brda imaju oči 2                                                          |The Hills Have Eyes II                                 |55388   |
|Brewsterovi milijuni                                                      |Brewster's Millions                                    |31821   |
|Brianov život                                                             |Monty Python's Life of Brian                           |318545  |
|Brijaci                                                                   |Barbershop                                             |27028   |
|Brijaci: Ponovno na poslu                                                 |Barbershop 2: Back in Business                         |12907   |
|Briljantin                                                                |Grease                                                 |197923  |
|Briljantin 2                                                              |Grease 2                                               |29518   |
|Briljantin 2                                                              |Son of Grease                                          |29518   |
|Brisač                                                                    |Eraser                                                 |93844   |
|Brod ljubavi: Sljedeći val                                                |Love Boat: The Next Wave                               |348     |
|Brodolom života                                                           |Cast Away                                              |453621  |
|Broj 23                                                                   |The Number 23                                          |180035  |
|Brza blagajna                                                             |10 Items or Less                                       |1203    |
|Brza isporuka                                                             |Premium Rush                                           |103385  |
|Brzi i žestoki                                                            |Redline                                                |309146  |
|Brzi i žestoki                                                            |Racer X                                                |309146  |
|Brzi i žestoki                                                            |The Fast and the Furious                               |309146  |
|Brzi i žestoki                                                            |Street Wars                                            |309146  |
|Brzi i žestoki 3: Tokio drift                                             |The Fast and the Furious: Tokyo Drift                  |209808  |
|Brzi i žestoki 3: Tokio drift                                             |The Fast and the Furious 3                             |209808  |
|Brzi i žestoki 4                                                          |The Fast and the Furious 4                             |233654  |
|Brzi i žestoki 4                                                          |Fast & Furious                                         |233654  |
|Brzi i žestoki 4                                                          |Fast & Furious 4                                       |233654  |
|Brzi i žestoki 5                                                          |Fast Five: The IMAX Experience                         |319410  |
|Brzi i žestoki 5                                                          |Fast & Furious 5                                       |319410  |
|Brzi i žestoki 5                                                          |Fast Five                                              |319410  |
|Brzi i žestoki 5                                                          |Fast & Furious 2                                       |319410  |
|Brzi i žestoki 5                                                          |The Fast and the Furious 5                             |319410  |
|Brzi i žestoki 5                                                          |Fast & Furious 5: Rio Heist                            |319410  |
|Brzi i žestoki 6                                                          |Fast and the Furious VI                                |337026  |
|Brzi i žestoki 6                                                          |Furious VI                                             |337026  |
|Brzi i žestoki 6                                                          |Fast & Furious 6                                       |337026  |
|Brzi i žestoki 6                                                          |Fast 6                                                 |337026  |
|Brzi i žestoki 7                                                          |Fast & Furious 7                                       |324436  |
|Brzi i žestoki 7                                                          |Fast and Furious 7                                     |324436  |
|Brzi i žestoki 7                                                          |Furious 7                                              |324436  |
|Brzi i žestoki 8                                                          |The Fast and the Furious 8                             |166851  |
|Brzi i žestoki 8                                                          |Fast Eight                                             |166851  |
|Brzi i žestoki 8                                                          |The Fate of the Furious                                |166851  |
|Brzi i žestoki 8                                                          |Furious Eight                                          |166851  |
|Brzina                                                                    |Speed                                                  |291566  |
|Brzina                                                                    |The Bus That Couldn't Slow Down                        |291566  |
|Brzina 2                                                                  |Speed 2: Cruise Control                                |66824   |
|Brzina 2                                                                  |Speed II                                               |66824   |
|Brüno                                                                     |Brüno                                                  |130680  |
|Brži od pravde                                                            |Faster                                                 |88530   |
|Bubimir                                                                   |Beetlejuice                                            |219732  |
|Bubimir                                                                   |Beetlejuice                                            |219732  |
|Bubimir                                                                   |Beetle Juice                                           |219732  |
|Bubimir                                                                   |The Maitlands                                          |219732  |
|Bucket i Skinner                                                          |Bucket and Skinner's Epic Adventures                   |1054    |
|Budan                                                                     |Awake                                                  |68249   |
|Budi hladnokrvan                                                          |A Many Splintered Thing                                |21657   |
|Budi hladnokrvan                                                          |Playing It Cool                                        |21657   |
|Budimo romanticni                                                         |Romantically Speaking                                  |396     |
|Budućnost                                                                 |Satisfaction                                           |7520    |
|Buffy - ubojica vampira                                                   |BtVS                                                   |114101  |
|Buffy - ubojica vampira                                                   |Buffy, the Vampire Slayer: The Series                  |114101  |
|Buffy - ubojica vampira                                                   |Buffy the Vampire Slayer                               |114101  |
|Buffy - ubojica vampira                                                   |Buffy                                                  |114101  |
|Bugsy                                                                     |Bugsy                                                  |23059   |
|Bulevar sumraka                                                           |Sunset Blvd.                                           |169977  |
|Bulevar sumraka                                                           |Sunset Boulevard                                       |169977  |
|Bulevar sumraka                                                           |A Can of Beans                                         |169977  |
|Bumbar ipak leti                                                          |The Bumblebee Flies Anyway                             |1635    |
|Buntovnica u internatu                                                    |Wild Child                                             |43449   |
|Buntovnik bez razloga                                                     |Rebel Without a Cause                                  |73193   |
|Burleska                                                                  |Burlesque                                              |68384   |
|Bus Bus                                                                   |Fantazoo                                               |302     |
|Bus Bus                                                                   |Funny Farm Madness                                     |302     |
|Bus Bus                                                                   |Boes                                                   |302     |
|Butch Cassidy i Sundance Kid                                              |The Sundance Kid and Butch Cassidy                     |179794  |
|Butch Cassidy i Sundance Kid                                              |Butch Cassidy and the Sundance Kid                     |179794  |
|Buđenja                                                                   |Awakenings                                             |107145  |
|CSI: Cyber                                                                |CSI: Cyber                                             |9214    |
|CSI: Las Vegas                                                            |CSI: Weekends                                          |71646   |
|CSI: Las Vegas                                                            |CSI: Crime Scene Investigation                         |71646   |
|CSI: Las Vegas                                                            |C.S.I.                                                 |71646   |
|CSI: Las Vegas                                                            |CSI: Las Vegas                                         |71646   |
|CSI: Miami                                                                |CSI: Miami                                             |48337   |
|CSI: Miami                                                                |CSI: Weekends                                          |48337   |
|CSI: New York                                                             |CSI: NY                                                |40083   |
|CSI: New York                                                             |CSI: New York                                          |40083   |
|Cagney i Lacey                                                            |Cagney & Lacey                                         |2575    |
|Californication                                                           |Untitled David Duchovny Series                         |159559  |
|Californication                                                           |Californication                                        |159559  |
|Californication                                                           |Untitled Tom Kapinos Project                           |159559  |
|Candyman                                                                  |Candyman                                               |56353   |
|Candyman                                                                  |Clive Barker's Candyman                                |56353   |
|Candyman 2: Zbogom tijelu                                                 |Candyman 2: Farewell to the Flesh                      |8499    |
|Candyman 2: Zbogom tijelu                                                 |Candyman: Farewell to the Flesh                        |8499    |
|Careva nova ćud                                                           |Kingdom of the Sun                                     |151693  |
|Careva nova ćud                                                           |Kingdom in the Sun                                     |151693  |
|Careva nova ćud                                                           |The Emperor's New Groove                               |151693  |
|Careva nova ćud 2: Kronkova nova ćud                                      |The Emperor's New Groove 2                             |8900    |
|Careva nova ćud 2: Kronkova nova ćud                                      |Kronk's New Groove                                     |8900    |
|Carlitov način                                                            |Carlito's Way                                          |180089  |
|Carrie                                                                    |Carrie                                                 |121287  |
|Carstvo Velikog Oza                                                       |Brick                                                  |188555  |
|Carstvo Velikog Oza                                                       |Oz the Great and Powerful                              |188555  |
|Carstvo poroka                                                            |Boardwalk Empire                                       |154116  |
|Carstvo sunca                                                             |Empire of the Sun                                      |102005  |
|Carstvo vatre                                                             |Reign of Fire                                          |116697  |
|Carstvo vatre                                                             |Where Heroes Go Down                                   |116697  |
|Carstvo vukova                                                            |Empire of the Wolves                                   |10294   |
|Casino Royale                                                             |James Bond 21                                          |522808  |
|Casino Royale                                                             |Bond Begins                                            |522808  |
|Casna                                                                     |The Nun                                                |15145   |
|Casna Zena                                                                |The Honorable Woman                                    |8569    |
|Casper                                                                    |Casper                                                 |101487  |
|Cast Prizzijevih                                                          |Prizzi's Honor                                         |20453   |
|Castle                                                                    |Castle                                                 |129503  |
|Cat Ballou                                                                |Cat Ballou                                             |11815   |
|Celeste & Jesse zauvijek                                                  |Celeste and Jesse Forever                              |26925   |
|Celeste & Jesse zauvijek                                                  |Celeste & Jesse Forever                                |26925   |
|Celicne magnolije                                                         |Steel Magnolias                                        |39853   |
|Cesar i Rosalie                                                           |César and Rosalie                                      |2045    |
|Cesta                                                                     |The Road                                               |200482  |
|Cetiri sobe                                                               |Four Rooms                                             |87396   |
|Cetiri sobe                                                               |Four Rooms and a Hotel                                 |87396   |
|Cetverored                                                                |File of four                                           |555     |
|Chance                                                                    |Chance                                                 |7512    |
|Charlie Chanova tajna                                                     |Charlie Chan's Secret                                  |1149    |
|Charlie Grace                                                             |Charlie Grace                                          |74      |
|Charlie i tvornica čokolade                                               |Charlie and the Chocolate Factory                      |371254  |
|Charlie i tvornica čokolade                                               |Charlie and the Chocolate Factory: The IMAX Experience |371254  |
|Charliejev svijet                                                         |The Perks of Being a Wallflower                        |408153  |
|Charliejevi anđeli                                                        |Charlie's Angels                                       |3788    |
|Charliejevi anđeli                                                        |Charlie's Angels                                       |8229    |
|Charliejevi anđeli                                                        |The Alley Cats                                         |8229    |
|Charliejevi anđeli                                                        |Charlie's Angels                                       |158670  |
|Charliejevi anđeli                                                        |Charlie's Angels: The Movie                            |158670  |
|Charliejevi anđeli 2                                                      |Charlie's Angels 2                                     |109821  |
|Charliejevi anđeli 2                                                      |Charlie's Angels: Halo                                 |109821  |
|Charliejevi anđeli 2                                                      |Charlie's Angels: Full Throttle                        |109821  |
|Chicago u plamenu                                                         |Chicago Fire                                           |28369   |
|Christiane F. - Mi djeca s Kolodvora Zoo                                  |We Children from Bahnhof Zoo                           |18584   |
|Christiane F. - Mi djeca s Kolodvora Zoo                                  |Christiane F.                                          |18584   |
|Chuck                                                                     |Chuck                                                  |117478  |
|Cigani lete u nebo                                                        |Queen of the Gypsies                                   |1300    |
|Ciganče                                                                   |Rascals                                                |7       |
|Cigla                                                                     |Brick                                                  |92580   |
|Cijena istine                                                             |The Lincoln Lawyer                                     |190930  |
|Cijena straha                                                             |The Sum of All Fears                                   |94238   |
|Cimerica                                                                  |The Roommate                                           |32048   |
|Cimpanze u svemiru                                                        |Space Chimps                                           |9755    |
|Cirkus                                                                    |La feria ambulante                                     |38950   |
|Cirkus nakaza: Vampirov pomoćnik                                          |Cirque du Freak: The Vampire's Assistant               |39291   |
|Cirkus nakaza: Vampirov pomoćnik                                          |Cirque du Freak                                        |39291   |
|Claire u pokretu                                                          |Claire in Motion                                       |533     |
|Cloud 9                                                                   |Cloud 9                                                |3007    |
|Cloverfield                                                               |Untitled J.J. Abrams Project                           |340407  |
|Cloverfield                                                               |Cloverfield                                            |340407  |
|Cloverfield                                                               |1-18-08                                                |340407  |
|Cloverfield                                                               |Cheese                                                 |340407  |
|Cloverfield                                                               |Monstrous                                              |340407  |
|Cloverfield                                                               |Clover                                                 |340407  |
|Cloverfield                                                               |Slusho                                                 |340407  |
|Cmok, cmok, bang, bang                                                    |You'll Never Die in This Town Again                    |196788  |
|Cmok, cmok, bang, bang                                                    |L.A.P.I.                                               |196788  |
|Cmok, cmok, bang, bang                                                    |Kiss Kiss Bang Bang                                    |196788  |
|Coco i velika tajna                                                       |Untitled Dia de los Muertos Project                    |213916  |
|Coco i velika tajna                                                       |Coco                                                   |213916  |
|Cole kojeg nitko ne poznaje                                               |The Cole Nobody Knows                                  |16      |
|Collateral                                                                |Collateral                                             |325347  |
|Collateral                                                                |Untitled Michael Mann Project                          |325347  |
|Con Air - Opasan let                                                      |Con Air                                                |248894  |
|Conan Barbarin                                                            |Conan the Barbarian                                    |88542   |
|Conan barbarin                                                            |Conan the Barbarian                                    |124398  |
|Confessions: Two Faces of Evil                                            |Confessions: Two Faces of Evil                         |115     |
|Confessions: Two Faces of Evil                                            |Mothershed and Burnt                                   |115     |
|Constantine                                                               |Hellblazer                                             |266687  |
|Constantine                                                               |Constantine                                            |266687  |
|Constantine                                                               |John Constantine: Hellblazer                           |266687  |
|Cosby                                                                     |Cosby                                                  |2027    |
|Cosby show                                                                |The Cosby Show                                         |28045   |
|Covjek bez lica                                                           |The Man Without a Face                                 |25290   |
|Covjek koga treba ubiti                                                   |The Man to Destroy                                     |197     |
|Covjek koji je previse znao                                               |Alfred Hitchcock's The Man Who Knew Too Much           |49437   |
|Covjek koji je previse znao                                               |Into Thin Air                                          |49437   |
|Covjek koji je previse znao                                               |The Man Who Knew Too Much                              |49437   |
|Covjek koji je volio zene                                                 |The Man Who Loved Women                                |1920    |
|Covjek koji se smanjuje                                                   |The Incredible Shrinking Man                           |13669   |
|Covjek na koljenima                                                       |A Man on His Knees                                     |217     |
|Creed: Legenda je rodena                                                  |Creed                                                  |200879  |
|Cristela                                                                  |Cristela                                               |2359    |
|Crkni, ljepotice                                                          |Dairy Queens                                           |29301   |
|Crna kiša                                                                 |Black Rain                                             |43969   |
|Crna lista                                                                |The Blacklist                                          |144549  |
|Crna misa                                                                 |Black Mass                                             |149947  |
|Crna udovica                                                              |Borgia                                                 |7442    |
|Crna udovica                                                              |Black Widow                                            |7442    |
|Crni dan u Parizu                                                         |The Take                                               |28388   |
|Crni gusar                                                                |The Black Corsair                                      |5       |
|Crni kotao                                                                |The Black Cauldron                                     |26005   |
|Crni labud                                                                |Black Swan                                             |623372  |
|Crni ljepotan                                                             |Black Beauty                                           |8193    |
|Crni ponedjeljak                                                          |Margin Call                                            |103596  |
|Crni sati                                                                 |The Darkest Hour                                       |53926   |
|Crni sati                                                                 |The Darkest Hour 3D                                    |53926   |
|Crno Svitanje                                                             |Black Dawn                                             |3288    |
|Croods                                                                    |Crood Awakening                                        |170913  |
|Croods                                                                    |The Croods                                             |170913  |
|Crvena država                                                             |Untitled Kevin Smith Horror Project                    |58155   |
|Crvena država                                                             |Red State                                              |58155   |
|Crvena linija 7000                                                        |Red Line 7000                                          |669     |
|Crvena rijeka                                                             |Red Water                                              |2432    |
|Crvena svjetla                                                            |Red Lights                                             |53834   |
|Crvena udovica                                                            |Red Widow                                              |2883    |
|Crvena zora                                                               |Red Dawn                                               |67926   |
|Crvena zora                                                               |Ten Soldiers                                           |45986   |
|Crvena zora                                                               |Red Dawn                                               |45986   |
|Crvene cipelice                                                           |The Red Shoes                                          |23      |
|Crvene cipelice                                                           |The Gypsy Ballerina                                    |23      |
|Crvene cipelice                                                           |The Beautiful Ballerina                                |23      |
|Crveni planet                                                             |Red Planet                                             |51381   |
|Crveni planet                                                             |Mars                                                   |51381   |
|Crveni vrabac                                                             |Red Sparrow                                            |102694  |
|Crvenkapica                                                               |Red Riding Hood                                        |99788   |
|Crvenkapica                                                               |The Girl with the Red Riding Hood                      |99788   |
|Crveno usijanje                                                           |Dimitri                                                |56533   |
|Crveno usijanje                                                           |Red Heat                                               |56533   |
|Cudesna suma                                                              |The Elmchanted Forest                                  |1136    |
|Cudesna suma                                                              |The Elm-Chanted Forest                                 |1136    |
|Cudni Thomas                                                              |Odd Thomas                                             |42043   |
|Cudni dani                                                                |Strange Days                                           |60567   |
|Cudni dani                                                                |Strange Days 1999                                      |60567   |
|Cudovista protiv vanzemaljaca                                             |Monsters vs. Aliens                                    |130474  |
|Cudovista protiv vanzemaljaca                                             |Monsters vs. Aliens: A Monstrous IMAX 3D Experience    |130474  |
|Cura na lošem glasu                                                       |Easy A                                                 |317167  |
|Cura na zadatku                                                           |Miss Congeniality                                      |160464  |
|Cura na zadatku 2                                                         |Miss Congeniality: Armed and Fabulous                  |60139   |
|Cura na zadatku 2                                                         |Miss Congeniality 2                                    |60139   |
|Cura na zadatku 2                                                         |Miss Congeniality 2: Armed & Fabulous                  |60139   |
|Cura na zadatku 2                                                         |Untitled Miss Congeniality Sequel                      |60139   |
|Cura za tulume                                                            |Party Girl                                             |3905    |
|Cure bez love                                                             |2 Broke Girls                                          |81935   |
|Cure bez love                                                             |Two Broke Girls                                        |81935   |
|Cure bez love                                                             |2 Broke Girl$                                          |81935   |
|Cure biraju                                                               |Leap Year                                              |82149   |
|Cure u trendu                                                             |Popular                                                |5574    |
|Cuvar snova                                                               |DreamKeeper                                            |1305    |
|Cyber nasilje                                                             |Cyberbu//y                                             |11240   |
|Cybill                                                                    |Cybill                                                 |2992    |
|Da Vincijev kod                                                           |The Da Vinci Code                                      |359460  |
|Da Vincijevi Demoni                                                       |Da Vinci's Demons                                      |68144   |
|Da sam ja netko                                                           |If I Were Someone                                      |44      |
|Dadilja                                                                   |The Nanny                                              |32589   |
|Dadilja McPhee                                                            |Nanny McPhee                                           |58601   |
|Dadilja u nevolji                                                         |Robin-B-Hood                                           |11279   |
|Dah smrti                                                                 |James Bond 007: The Living Daylights                   |77768   |
|Daj mi ruku                                                               |Give Me Your Hand                                      |1107    |
|Daj mi sebe                                                               |The Family Man                                         |94225   |
|Daleci na Zemlji 2150.                                                    |Daleks Invade Earth 2150 A.D.                          |2767    |
|Daleci na Zemlji 2150.                                                    |Dr. Who: Daleks Invasion Earth 2150 A.D.               |2767    |
|Daleki horizonti                                                          |Far and Away                                           |53204   |
|Daleko od kuće                                                            |Far from Home: The Adventures of Yellow Dog            |2275    |
|Daleko od kuće                                                            |Yellow Dog                                             |2275    |
|Daleko od očiju                                                           |Out of Sight                                           |77783   |
|Dallas                                                                    |Oil                                                    |9802    |
|Dallas                                                                    |Dallas                                                 |9802    |
|Dallas                                                                    |The Linda Evans-Project                                |9802    |
|Dama i skitnica                                                           |La dama y el vagabundo                                 |102355  |
|Dama i skitnica 2: Švrćina pustolovina                                    |Lady and the Tramp II: Scamp's Adventure               |8374    |
|Dama i skitnica 2: Švrćina pustolovina                                    |Lady and the Tramp 2: Scamp's Adventure                |8374    |
|Dama s kamelijama                                                         |Camille                                                |6388    |
|Dama u sivom                                                              |Sherlock Holmes: The Grey Lady                         |24      |
|Dama u sivom                                                              |The Gray Lady                                          |24      |
|Dama u sivom                                                              |Die graue Dame                                         |24      |
|Damon                                                                     |Damon                                                  |148     |
|Dan gnjeva                                                                |Day of Wrath                                           |7823    |
|Dan kad se Zemlja zaustavila                                              |D.T.E.S.S.                                             |151779  |
|Dan kad se Zemlja zaustavila                                              |The Day the Earth Stood Still: The IMAX Experience     |151779  |
|Dan kad se Zemlja zaustavila                                              |The Day the Earth Stood Still                          |151779  |
|Dan lose srece                                                            |Hard Luck                                              |2734    |
|Dan nezavisnosti                                                          |Independence Day                                       |479977  |
|Dan nezavisnosti                                                          |ID4                                                    |479977  |
|Dan nezavisnosti                                                          |Independence Day 3D                                    |479977  |
|Dan nezavisnosti Nova prijetnja                                           |Independence Day: Resurgence                           |148213  |
|Dan nezavisnosti Nova prijetnja                                           |ID Forever Part 1                                      |148213  |
|Dan noć                                                                   |Day Night Day Night                                    |1988    |
|Dan obuke                                                                 |Training Day                                           |343992  |
|Dan poslije sutra                                                         |Tomorrow                                               |371815  |
|Dan poslije sutra                                                         |The Day After Tomorrow                                 |371815  |
|Dan prije pogubljenja                                                     |The Man Who Cried Wolf                                 |35      |
|Dan zaljubljenih                                                          |Valentine's Day                                        |103940  |
|Dani groma                                                                |Days of Thunder                                        |69234   |
|Dani panike                                                               |The Last Days                                          |6741    |
|Dani radija                                                               |Radio Days                                             |27767   |
|Dani slave                                                                |Old School                                             |199229  |
|Danielle Steel: Otkucaj srca                                              |Heartbeat                                              |315     |
|Danova prava ljubav                                                       |Dan in Real Life                                       |92134   |
|Danteov vrh                                                               |Dante's Peak                                           |70810   |
|Dar                                                                       |Weirdo                                                 |115911  |
|Dar                                                                       |The Gift                                               |115911  |
|Dar                                                                       |The Gift                                               |57073   |
|Dar života                                                                |The Gift of Life                                       |33      |
|Darjeeling d.o.o.                                                         |The Darjeeling Limited                                 |158949  |
|Darovi mrznje                                                             |A Thousand Acres                                       |4688    |
|Dave je napravio labirint                                                 |Dave Made a Maze                                       |3232    |
|Deadpool                                                                  |Deadpool                                               |760486  |
|Deadpool                                                                  |X-Men: Deadpool                                        |760486  |
|Deadpool                                                                  |X-Men Origins: Deadpool                                |760486  |
|Deadpool 2                                                                |DP2                                                    |253691  |
|Deadpool 2                                                                |Deadpool 2: The Super Duper Cut                        |253691  |
|Deadpool 2                                                                |Daisy                                                  |253691  |
|Deadpool 2                                                                |Love Machine                                           |253691  |
|Deadpool 2                                                                |Deadpool 2                                             |253691  |
|Deadwood                                                                  |Deadwood                                               |77926   |
|Debela mama: kakav otac, takav sin                                        |Big Momma's House 3                                    |22609   |
|Debela mama: kakav otac, takav sin                                        |Big Mommas: Like Father, Like Son                      |22609   |
|Decki i cure                                                              |Boys and Girls                                         |14829   |
|Demoni                                                                    |Diabolique                                             |53776   |
|Demoni                                                                    |The Devils                                             |53776   |
|Demonsko                                                                  |Demonic                                                |11328   |
|Deran                                                                     |40 Girls and a Baby                                    |7       |
|Deran                                                                     |Forty Little Mothers                                   |7       |
|Dersu Uzala                                                               |Dersu Uzala                                            |20344   |
|Deset godina                                                              |10 Years                                               |21746   |
|Deset sekundi za bijeg                                                    |Ten-Second Jailbreak                                   |2861    |
|Deset sekundi za bijeg                                                    |Breakout                                               |2861    |
|Deset zapovijedi                                                          |Prince of Egypt                                        |55211   |
|Deset zapovijedi                                                          |The Ten Commandments                                   |55211   |
|Deseta stuba                                                              |Dragonfly                                              |34152   |
|Desperado                                                                 |Desperado                                              |154297  |
|Desperado                                                                 |Pistolero                                              |154297  |
|Desperado                                                                 |El Mariachi 2                                          |154297  |
|Desperado                                                                 |Jesse James                                            |3432    |
|Desperado                                                                 |Darryl F. Zanuck's Production of Jesse James           |3432    |
|Detektiv McQ                                                              |McQ                                                    |4025    |
+--------------------------------------------------------------------------+-------------------------------------------------------+--------+
only showing top 1000 rows
</code></pre>


