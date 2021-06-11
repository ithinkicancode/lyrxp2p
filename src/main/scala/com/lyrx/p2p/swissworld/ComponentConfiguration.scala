package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, Essay}
import com.lyrx.p2p.swissworld.pages.{Articles, Change, FreeConsulting, Landing, Tomorrow, WhereAreWe}
import org.scalajs.dom.window
import slinky.core.facade.ReactElement

object ComponentConfiguration {

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


    case AppProps(_, Articles.page)
    => Articles(props)

    case AppProps(_, ".html") =>  Landing(props)


    case AppProps(_, s:String)
    => Essay.createEssay(props,s,"swissworld",None)


    case _ => Landing(props)
  }



  def INITPROPS(): AppProps = {
    val h: String = s"${window.location.hash.stripPrefix("#")}.html"
    AppProps(currentLang = "", page = h)
  }

}
