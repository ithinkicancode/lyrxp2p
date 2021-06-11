package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppProps
import com.lyrx.p2p.rwanda.pages.{Catherine, Charlotte, Claudine, Francine, Landing}
import org.scalajs.dom.window
import slinky.core.facade.ReactElement

object ComponentConfiguration {




  def getComponent(props: AppProps): ReactElement = props match {
    case AppProps(_, Catherine.page)  => Catherine(props)
    case AppProps(_, Claudine.page)  => Claudine(props)
    case AppProps(_, Francine.page)  => Francine(props)
    case AppProps(_, Charlotte.page)  => Charlotte(props)
    case _ => Landing(props)
  }

  def INITPROPS(): AppProps = {
    val h: String = s"${window.location.hash.stripPrefix("#")}.html"
    AppProps(currentLang = "",
      page = h)
  }

}
