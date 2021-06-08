package com.lyrx.p2p

import slinky.web.ReactDOM
import org.scalajs.dom.document

import org.scalatest.FunSuite

object AppTest  {

  val testString =
    """
      dsfsdf

      sfdsdffsdfsdsfd
      sdffdsfsdfdsfds
      dfssdfdsf


      fdsfsfsfdsfds
      fsd

      fsdfdssfd

      """


  def toParArray(s:String)= s.split("""\n\n+""").map(_.trim())

  def main(args:Array[String]):Unit={
    val pars: Array[String] = toParArray(testString)

    println(pars.length)
  }

}
