package com.lyrx.p2p

import com.lyrx.p2p.swissworld.Phrases
import slinky.core.Component
import slinky.core.annotations.react
import slinky.web.html._

import scala.scalajs.js.Dynamic.literal

@react class MArticle extends Component {

  type State = AppState

  case class Props( action: () => Unit,
                    text: String,
                   pars: Seq[String],
                    aPage:String
                  )


  def initialState = AppState("")


  def render() = {
    val newHash = Phrases.toHash(props.aPage)
    article(
      header(className := "major")(
        h3(a(
          href := newHash,
          onClick := props.action,
          className := "link")(props.text)),

        props.pars.map(s => p(key := s"${s.hashCode()}")(
          a(
            href := newHash,
            onClick := props.action,
            className := "link")(s)
        )),

        p(style := literal(marginTop = "10px"))(a(
          href := newHash,
          onClick := props.action,
          className := "link")(" ... " ))
      ))
  }


}
