package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppState
import com.lyrx.p2p.rwanda.pages.{Catherine, Claudine, Landing}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


@react class MenuItems extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()


  def linkItem(page: String, text: String) = li()(a(href := "#", onClick := ((e) => {
    e.stopPropagation()
    Main.toPage(props, page)
  }))(text))

  def renderDE() =
    Fragment(
      linkItem(page = Landing.page, text = "Start"),
      linkItem(page = Catherine.page, text = "Catherine"),
       linkItem(page = Claudine.page, text = "Claudine")
    )




  def renderEN() =
    Fragment(
      linkItem(page = Landing.page, text = "Home"),
      linkItem(page = Catherine.page, text = "Catherine"),
      linkItem(page = Claudine.page, text = "Claudine")
    )


}
