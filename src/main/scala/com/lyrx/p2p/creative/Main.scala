package com.lyrx.p2p.creative


import com.lyrx.p2p.Helpers
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
  }


  def doRender(): Unit = {
    Helpers.render(Seq[(ReactElement, String)](
      (BannerTitle(), "banner-title"),
      (PageTitle(), "page-title"),

    ))

  }


}
