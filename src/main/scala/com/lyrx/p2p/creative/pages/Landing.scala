package com.lyrx.p2p.creative.pages

import com.lyrx.p2p.{AppProps, AppState, Helpers, MArticle, MWizard}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._

@react class Landing extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")

  def render() = section(id := "one", className := "tiles")(

    MArticle(action = (() => Helpers.renderMainElement(
        MWizard(props,
          url = "md/creative/test.md",
          maybeImages = Seq(),
          titleOpt = Some("A test"),
          isDual = false))),
      text = "Dummy",
      pars = Seq("ein Inhalt"),
      aPage = "test.html")

  )
}

