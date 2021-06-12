package com.lyrx.p2p.creative


import com.lyrx.p2p.Helpers
import org.scalajs.dom
import org.scalajs.dom.raw.{Element, HTMLAnchorElement, HTMLDivElement}
import slinky.core.facade.ReactElement
import slinky.hot

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.{LinkingInfo, js}

@JSImport("resources/css/index.css", JSImport.Default)
@js.native
object IndexCSS extends js.Object

object Main {
  val css = IndexCSS


  def startup(): Unit = {
    if (LinkingInfo.developmentMode) {
      hot.initialize()
    }
    doRender()




    val e: HTMLAnchorElement = dom.document.
      getElementById("menu-menu").
      asInstanceOf[HTMLAnchorElement]
    e.style.visibility = "hidden"


  }


  def doRender(): Unit = {
    Helpers.render(Seq[(ReactElement, String)](
      (BannerTitle(), "banner-title"),
      (PageTitle(), "page-title"),
    ))

  }


}
