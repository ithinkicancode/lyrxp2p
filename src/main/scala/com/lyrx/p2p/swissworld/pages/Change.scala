package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.Helpers._
import com.lyrx.p2p.{AppState, MarkdownLoader}
import com.lyrx.p2p.swissworld.Main.showTomorrow
import com.lyrx.p2p.swissworld.{AppProps, Phrases}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object Change {
  val page: String = "concept.html"
}


@react class Change extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def renderDE() = Fragment(
    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Wandel")
    ),
    MarkdownLoader("md/swissworld/pages/change.md"),
    p("Und ", a(href := Phrases.toHash(Tomorrow.page), onClick := showTomorrow(props))("morgen"), " die ganze Welt ...")
  )


  def renderEN() = Fragment(
    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Change")
    ),
    MarkdownLoader("md/swissworld/pages/change_en.md"),
    p("And ", a(href := Phrases.toHash(Tomorrow.page), onClick := showTomorrow(props))("tomorrow"), " the whole world ...")
  )


  def render() = section(id := "one")(
    div(className := "inner")(
      span(className := "image main")(img(src := "images/swissworld/ideas.png")),
      if (props.isGerman()) renderDE() else renderEN()
    ))


}
