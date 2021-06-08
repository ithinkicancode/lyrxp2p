package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppState
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment


@react class BannerTitle extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if(props.isGerman())renderDE()else renderEN()



  def renderDE() =
    Fragment(
      "Ruanda, das Land der Frauen"
    )

  def renderEN() =
    Fragment(
      """Rwanda, the Land of Women"""   )


}
