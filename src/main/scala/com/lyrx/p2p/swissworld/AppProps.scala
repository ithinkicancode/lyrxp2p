package com.lyrx.p2p.swissworld

import com.lyrx.p2p.swissworld.pages._
import org.scalajs.dom.window
import slinky.core.facade.ReactElement


object AppProps {

  val pages = Seq(
    Change.page,
    Landing.page,
    Tomorrow.page,
    WhereAreWe.page,
    FreeConsulting.page,
    Scalability.page
  )

  def getComponent(props: AppProps): ReactElement = props match {

    case AppProps(_, Landing.page)
    => Landing(props)

    case AppProps(_, WhereAreWe.page)
    => WhereAreWe(props)

    case AppProps(_, Change.page)
    => Change(props)

    case AppProps(_, Tomorrow.page)
    => Tomorrow(props)

    case AppProps(_, FreeConsulting.page)
    => FreeConsulting(props)

    case AppProps(_, Scalability.page)
    => Scalability(props)

    case _ => Landing(props)
  }



  def INITPROPS(): AppProps = {
    val h: String = s"${window.location.hash.stripPrefix("#")}.html"
    AppProps(currentLang = "",
      page = if (pages.contains(h)) h else Landing.page)
  }

}


case class AppProps(currentLang: String, page: String) {

  def isGerman(): Boolean = currentLang.toLowerCase.startsWith("de")


  def switchLanguage() =
    if (isGerman())
      this.copy(currentLang = "EN")
    else
      this.copy(currentLang = "DE")


}



