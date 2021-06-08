package com.lyrx.p2p.swissworld

import scala.collection.immutable.HashMap

object Phrases {
  val COMPANY = "Swiss World Teamup"


  def toHash(s:String) = s"#${s.stripSuffix(".html")}"


  type I18MAP = HashMap[String, String]
  type LANGMAP = HashMap[String, I18MAP]

  val M: LANGMAP = HashMap(
    "de" -> HashMap(
      "title" -> COMPANY,
      "topic1" -> "Verständnis für den Augenblick",
      "topic2" -> "Wandel ist beständig",
      "topic3" -> "Auf Morgen kann man lange warten, es ist immer Heute",
    ),
    "en" -> HashMap(
      "title" -> COMPANY,
      "topic1" -> "Understand The Moment",
      "topic2" -> "Change Is Permanent",
      "topic3" -> "Tomorrow Never Happens",

    )
  )

}
