package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.swissworld.{AppProps, Main}
import com.lyrx.p2p.{AppState, MArticle}
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


  def fragments(titles: Seq[String], parsArray: Seq[Seq[String]]) = Fragment(

    MArticle(action = (() => Main.toPage(props, "scaling.html")), text = titles(0), parsArray(0), aPage = "scaling.html"),


  )

  def renderDE() = fragments(Seq(
    s"Was Skalierbarkeit im Kryptowährungsraum bedeutet"),

    Seq(
      Seq("""... und was für Konsequenzen das hat.""")))


  def renderEN() = fragments(Seq(
    s"What Scalability means in the crypto currency space"),

    Seq(
      Seq("""... what the consequences are."""
       )))


  def render() = section(id := "one", className := "tiles")(
    if (props.isGerman()) renderDE() else renderEN()
  )


}
