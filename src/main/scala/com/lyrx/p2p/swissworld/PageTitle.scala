package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState}
import com.lyrx.p2p.swissworld.Main.showLanding
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._

@react class PageTitle extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()


  def renderDE() = Fragment(
    a(href := "#",
      className := "logo",
      onClick := showLanding(props))
    (
      strong(s"Swiss World")), span("Teamup"))


  def renderEN() = Fragment(
    a(href := "#",
      className := "logo",
      onClick := showLanding(props))(
      strong(s"Swiss World")), span("Teamup"))


}
