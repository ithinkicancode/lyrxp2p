package com.lyrx.p2p.rwanda

import com.lyrx.p2p.rwanda.pages.Landing
import org.scalajs.dom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.window
import slinky.hot
import slinky.web.ReactDOM

import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}
import scala.scalajs.{LinkingInfo, js}

@JSImport("resources/css/index.css", JSImport.Default)
@js.native
object IndexCSS extends js.Object

object Main {
  val css = IndexCSS



  def showLanding(props: AppProps) = (()=>Main.toPage(props,Landing.page))





  def startup(): Unit = {
    if (LinkingInfo.developmentMode) {
      hot.initialize()
    }
    doRender()
  }

  def findLanguage(appProps: AppProps) = {
    appProps.copy(currentLang = window.navigator.language)

  }


  case class SlinkyElements(
                             banner: Element,
                             langSelector: Element,
                             menuItems: Element,
                             mainContents:Element,
                             bannerTitle:Element,
                             contact:Element,
                             footer:Element,
                             pageTitle:Element,
                             appProps: AppProps
                           )


  def initProps()={
    val aBanner: Element = dom.document.getElementById("intro-text")
    val aLangSelector: Element = dom.document.getElementById("language-selector")
    val menu: Element = dom.document.getElementById("menu-links")
    val aMainContents:Element = dom.document.getElementById("main")
    val aBannerTitle: Element = dom.document.getElementById("banner-title")
    val contactElement: Element = dom.document.getElementById("contact")
    val footerElement: Element = dom.document.getElementById("footer")
    val pageTitleElement: Element = dom.document.getElementById("page-title")


    SlinkyElements(banner = aBanner,
      langSelector = aLangSelector,
      menuItems = menu,
      mainContents = aMainContents,
      bannerTitle  = aBannerTitle,
      contact = contactElement,
      footer = footerElement,
      pageTitle = pageTitleElement,
      appProps = findLanguage(AppProps.INITPROPS()))
  }

  def doRender(): Unit = doRenderElements(initProps())


  def switchLanguage(aProps:AppProps):Unit =  doRenderElements(initProps().copy(appProps = aProps.switchLanguage()))
  def toPage(aProps:AppProps,aPage:String):Unit = doRenderElements(initProps().copy(appProps = aProps.copy(page = aPage)))

  def doRenderElements(elements: SlinkyElements): Unit = {
    ReactDOM.render(BannerTitle(elements.appProps), elements.bannerTitle)
    ReactDOM.render(Banner(elements.appProps), elements.banner)
    ReactDOM.render(LanguageSelector(elements.appProps), elements.langSelector)
    ReactDOM.render(MenuItems(elements.appProps), elements.menuItems)
    ReactDOM.render(MainContents(elements.appProps), elements.mainContents)
    ReactDOM.render(PageTitle(elements.appProps), elements.pageTitle)

  }


}
