package com.lyrx.p2p


import org.scalajs.dom
import org.scalajs.dom.ext.Ajax
import org.scalajs.dom.window
import slinky.core.{BuildingComponent, KeyAndRefAddingStage}
import slinky.core.facade.{Fragment, ReactElement}
import slinky.web.ReactDOM
import slinky.web.html._

import scala.concurrent.{ExecutionContext, Future}
import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal
import typings.showdown.mod.Converter




object Helpers {

  def render(s:Seq[(ReactElement,String)])= s.map(
     t=>
    ReactDOM.render(
      t._1,
      dom.document.getElementById(t._2))
  )

  def renderMainElement(element:ReactElement
    )= ReactDOM.render(element,dom.document.getElementById("main"))



  def italic(s:String) =  span(style:=literal(fontStyle="italic"))(s)
  def mail(mailAddress:String,subject:String,text:String) ={

    a(href := s"mailto:${mailAddress}?subject=${subject}")(s"${text}" )
  }


  implicit class PimpedString(s:String) {
    def pars(): BuildingComponent[Nothing, js.Object] = toParArray(s)

    def md(): ReactElement = markdown(s)
  }


  def toParArray(s:String): BuildingComponent[Nothing, js.Object] = Fragment(s.
    split("""\n\n+""").toSeq
    .map(_.trim())
  .map(s =>p(key:= s.hashCode().toString())(s)))


  def loadString(url: String): Future[String] =
    Ajax.get(url).map((r: dom.XMLHttpRequest) => r.responseText)(ExecutionContext.global)

  def markdown(text: String): ReactElement = {
    val converter: Converter = Converter.newInstance0()
    val r: String = converter.makeHtml(text)
    div(
      //key := text.hashCode.toString,
      className:="markdown",
      dangerouslySetInnerHTML := js.Dynamic.literal(__html = r)
    )()
  }


  def toHash(s:String) = s"#${toName(s)}"

  def toName(s:String) = s"${s.stripSuffix(".html")}"



  def INITPROPS(): AppProps = {
    val h: String = s"${window.location.hash.stripPrefix("#")}.html"
    AppProps(currentLang = "", page = h)
  }

}
