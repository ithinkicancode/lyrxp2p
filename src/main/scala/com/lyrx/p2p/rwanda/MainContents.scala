package com.lyrx.p2p.rwanda

import com.lyrx.p2p.{AppProps, AppState}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.ReactElement


@react class MainContents extends Component {

  type State = AppState
  type Props = AppProps
  def initialState = AppState("")






  def render():ReactElement = ComponentConfiguration.getComponent(props)





}
