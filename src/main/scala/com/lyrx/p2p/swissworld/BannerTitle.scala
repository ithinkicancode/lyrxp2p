package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.Fragment

@react class BannerTitle extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()


  def renderDE() =
    Fragment(
      "Die Schweizer IT-Beratung"
    )

  def renderEN() =
    Fragment(
      """Swiss IT-Consulting""")


}
