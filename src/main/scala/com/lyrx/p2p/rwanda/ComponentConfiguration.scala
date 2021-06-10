package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppProps
import com.lyrx.p2p.rwanda.pages.{Catherine, Claudine, Landing}
import org.scalajs.dom.window
import slinky.core.facade.ReactElement

object ComponentConfiguration {


  val pages = Seq(
    Catherine.page,
    Claudine.page
  )

  def getComponent(props: AppProps): ReactElement = props match {
    case AppProps(_, Catherine.page)  => Catherine(props)
    case AppProps(_, Claudine.page)  => Claudine(props)
    case _ => Landing(props)
  }

  def INITPROPS(): AppProps = {
    val h: String = s"${window.location.hash.stripPrefix("#")}.html"
    AppProps(currentLang = "",
      page = if (pages.contains(h)) h else Landing.page)
  }

}
