package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppState
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


@react class LanguageSelector extends Component {
  type Props = AppProps
  type State = AppState



  def initialState = AppState("")


  def render() = a(href:="#",onClick := (()=>Main.switchLanguage(props)))(
    if(props.isGerman()
    )
      s"[EN]" else s"[DE]"
  )



}
