package com.lyrx.p2p.swissworld

import com.lyrx.p2p.AppState
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

@react class MainContents extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")

  def render(): ReactElement = AppProps.getComponent(props)

}
