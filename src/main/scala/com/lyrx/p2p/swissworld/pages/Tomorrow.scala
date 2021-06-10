package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.{AppProps, AppState, MarkdownLoader}
import com.lyrx.p2p.swissworld.Phrases
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object Tomorrow {
  val page: String = "value.html"
}


@react class Tomorrow extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def renderDE() = Fragment(

    header(className := "major",
      h2(s"${Phrases.COMPANY.toUpperCase()}: Morgen")
    ),
    MarkdownLoader("md/swissworld/pages/tomorrow.md")

  )

  def renderEN() = Fragment(
    header(className := "major",
      h2(s"${Phrases.COMPANY.toUpperCase()}: Tomorrow")
    ),
    MarkdownLoader("md/swissworld/pages/tomorrow_en.md")


  )

  def render() = section(id := "one")(
    div(className := "inner")(
      span(className := "image main")(img(src := "images/swissworld/addedvalue.jpg")),
      if (props.isGerman()) renderDE() else renderEN()
    ))


}
