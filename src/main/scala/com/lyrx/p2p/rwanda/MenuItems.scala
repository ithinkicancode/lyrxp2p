package com.lyrx.p2p.rwanda

import com.lyrx.p2p.rwanda.pages._
import com.lyrx.p2p.{AppProps, AppState}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


@react class MenuItems extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()


  def linkItem(page: String, text: String) = li(
    key:=text.hashCode().toString()

  )(a(href := "#", onClick := ((e) => {
    e.stopPropagation()
    Main.toPage(props, page)
  }))(text))


  def women()=Seq(
    linkItem(page = Catherine.page, text = "Catherine"),
    linkItem(page = Claudine.page, text = "Claudine"),
    linkItem(page = Francine.page, text = "Francine"),
    linkItem(page = Charlotte.page, text = "Charlotte")
  )


  def renderDE() =
    Fragment(
      linkItem(page = Landing.page, text = "Start"),
      women()

    )


  def renderEN() =
    Fragment(
      linkItem(page = Landing.page, text = "Home"),
      women()
    )


}
