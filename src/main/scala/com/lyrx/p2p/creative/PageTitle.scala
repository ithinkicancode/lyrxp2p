package com.lyrx.p2p.creative

import com.lyrx.p2p.AppState
import com.lyrx.p2p.rwanda.pages.Landing
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html.{onClick, _}


@react class PageTitle extends Component {
  type Props = Unit
  type State = AppState



  def initialState = AppState("")


  def render() = Fragment(
    a( href:="#",className:="logo", strong("Unbegrenzte Gegenwart"), span("")))


}
