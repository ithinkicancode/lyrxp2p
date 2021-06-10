package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppState
import com.lyrx.p2p.AppProps
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


@react class Banner extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if(props.isGerman())renderDE()else renderEN()

  def renderDE() =
    Fragment(
      p("Wir bekennen  uns zu den Frauen in Ostafrika", br())
    )

  def renderEN() =
    Fragment(
      p("We are committed to women in East Africa", br())
    )


}
