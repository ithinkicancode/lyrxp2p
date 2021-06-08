package com.lyrx.p2p.rwanda

import scala.collection.immutable.HashMap


object Phrases {

  type I18MAP = HashMap[String,String]
  type LANGMAP = HashMap[String,I18MAP]

  val M:LANGMAP = HashMap(
    "de" -> HashMap(
      "title" -> "Die Frauen in Ruanda sind stark",

      "topic1" -> "Verständnis",
      "topic2" -> "Wandel",
      "topic3" -> "Morgen",
    ),
    "en" -> HashMap(

      "title" -> "Rwanda Women Are Strong",
      "topic1" -> "Understand",
      "topic2" -> "Change",
      "topic3" -> "Tomorrow",

    )
  )

}
