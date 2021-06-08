package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppState
import com.lyrx.p2p.rwanda.pages.Landing
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html.{onClick, _}


@react class PageTitle extends Component {
  type Props = AppProps
  type State = AppState

  def showLanding(props: AppProps) = (()=>Main.toPage(props,Landing.page))


  def initialState = AppState("")


  def render() = if(props.isGerman())renderDE()else renderEN()



  def renderDE() = Fragment(
    a( href:="#",className:="logo", onClick:= showLanding(props))(strong(s"${Phrases.M.get("de").get("title")}")), span())


  def renderEN() =Fragment(
    a( href:="#",className:="logo", onClick:= showLanding(props))(strong(s"${Phrases.M.get("en").get("title")}")), span())


}
