package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState}
import org.scalajs.dom.raw.History
import org.scalajs.dom.{PopStateEvent, window}
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{Component, FunctionalComponent}


@react class MainContents extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")

  def backButton() = {

    val history: History = window.history



   window.onpopstate = (e:PopStateEvent) => {


   }






  }

  override def componentDidMount(): Unit = {
    super.componentDidMount()
   backButton()
  }

  def cc() = FunctionalComponent[Props] { props => {

    ComponentConfiguration.getComponent(props)
  }

  }

  def render(): ReactElement = cc()(props) // ComponentConfiguration.getComponent(props)

}
