package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.web.html.{a, href, onClick}

@react class LanguageSelector extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = a(href := "#", onClick := ((e) => {
    e.stopPropagation()
    e.preventDefault()
    Main.switchLanguage(props)
  }))(
    if (props.isGerman()
    )
      s"[EN]" else s"[DE]"
  )


}
