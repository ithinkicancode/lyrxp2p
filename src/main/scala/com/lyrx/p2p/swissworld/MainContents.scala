package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState}
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{Component, FunctionalComponent}
import vision.id.rrd.facade.history.mod.{Action, History, Location}
import vision.id.rrd.facade.reactRouterDom.{mod => rreact}


@react class MainContents extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")

  def backButton() = {


    val h: History[Nothing] = rreact.useHistory()


    h.listen((e1, e2) => {
      val location: Location[Nothing] = e1;
      val action: Action = e2;

      println(e2)


    })
  }

  override def componentDidMount(): Unit = {
    super.componentDidMount()
    //backButton()
  }

  def cc() = FunctionalComponent[Props] { props => {
    ComponentConfiguration.getComponent(props)
  }

  }

  def render(): ReactElement = {


    cc()(props)


  }

}
