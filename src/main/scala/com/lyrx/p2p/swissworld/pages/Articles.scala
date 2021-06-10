package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.swissworld.Main
import com.lyrx.p2p.{AppProps, AppState, MArticle}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object Articles {
  val page: String = "articles.html"

}


@react class Articles extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def essay(page:String,title: String, pars: Seq[String]) = MArticle(
    action = (() => Main.toPage(props, page)),
    text = title,
    pars,
    aPage = page)


  def renderDE() = Fragment(
    essay(
    page="scaling.html",
    title= s"Was Skalierbarkeit im Kryptowährungsraum bedeutet",
    pars = Seq("""... und was für Konsequenzen das hat.""")
  ),

  )


  def renderEN() = Fragment(
    essay(
      page="scaling.html",
      title=  s"What Scalability Means In The Cryptourrency Space",
    pars = Seq("""... what the consequences are.""")
  ),

  )


  def render() = section(id := "one", className := "tiles")(
    if (props.isGerman()) renderDE() else renderEN()
  )


}
