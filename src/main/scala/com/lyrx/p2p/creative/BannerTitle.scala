package com.lyrx.p2p.creative

import com.lyrx.p2p.AppState
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment


@react class BannerTitle extends Component {
  type Props = Unit
  type State = AppState


  def initialState = AppState("")


  def render() =  Fragment(
      """Texte für den  Privatgebrauch"""   )


}
