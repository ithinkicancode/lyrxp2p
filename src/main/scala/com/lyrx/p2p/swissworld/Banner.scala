package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html.{br, p}

@react class Banner extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()

  def renderDE() =
    Fragment(
      p("Consulting, Projektmanagement und Softwareentwicklung", br())
    )

  def renderEN() =
    Fragment(
      p("Consulting, Project Management and Software Development", br())
    )


}
