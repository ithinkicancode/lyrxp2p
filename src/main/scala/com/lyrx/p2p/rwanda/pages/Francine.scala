package com.lyrx.p2p.rwanda.pages

import com.lyrx.p2p.rwanda.MSection
import com.lyrx.p2p.{AppProps, AppState, Essay}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._




object Francine {
  val page = "francine.html"
}


@react class Francine extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def render() = Essay.createEssay(
    a = props,
    name="francine",
    aApp = "rwanda",
    Some("Francine MUHAWENIMANA")
  )


}
