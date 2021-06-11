package com.lyrx.p2p.rwanda.pages

import com.lyrx.p2p.rwanda.MSection
import com.lyrx.p2p.{AppProps, AppState, Essay}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._






object Charlotte {
  val page = "charlotte.html"
}

@react class Charlotte extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def render() = Essay.createEssay(
    a = props,
    name="charlotte",
    aApp = "rwanda",
    Some("Charlotte MUHAWENIMANA")
  )



}
