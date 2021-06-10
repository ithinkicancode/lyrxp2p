package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.Helpers._
import com.lyrx.p2p.{AppProps, AppState, MarkdownLoader}
import com.lyrx.p2p.swissworld.Main.showChange
import com.lyrx.p2p.swissworld.Phrases
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object WhereAreWe {
  val mail = "enna@mailbox.org"
  val page: String = "where.html"
}

@react class WhereAreWe extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def renderDE() = Fragment(

    header(className := "major",
      h2(s"${Phrases.COMPANY.toUpperCase()}: Wo wir jetzt sind")
    ),
    MarkdownLoader("md/swissworld/pages/whereweare.md")
    ,
    p("Und nun kommt der ", a(href := Phrases.toHash(Change.page), onClick := showChange(props))("Wandel ..."))

  )

  def renderEN() = Fragment(
    header(className := "major",
      h2(s"${Phrases.COMPANY.toUpperCase()}: Where we are now")
    ),
    MarkdownLoader("md/swissworld/pages/whereweare_en.md")
    ,
    p("Here comes ", a(href := Phrases.toHash(Change.page), onClick := showChange(props))("change ..."))

  )

  def render() = section(id := "one")(
    div(className := "inner")(
      span(className := "image main")(img(src := "images/swissworld/leuchtturm.png")),
      if (props.isGerman()) renderDE() else renderEN()
    ))


}
