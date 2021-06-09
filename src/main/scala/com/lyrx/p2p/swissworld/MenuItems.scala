package com.lyrx.p2p.swissworld

import com.lyrx.p2p.swissworld.pages.{Articles, Change, Landing, Tomorrow, WhereAreWe}
import com.lyrx.p2p.AppState
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html.{a, href, li, onClick}

@react class MenuItems extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()


  def linkItem(page: String, text: String) = li()(a(href := Phrases.toHash(page), onClick := ((e) => {
    e.stopPropagation()
    Main.toPage(props, page)
  }))(text))

  def renderDE() =
    Fragment(
      linkItem(page = Landing.page, text = "Start"),
      linkItem(page = WhereAreWe.page, text = "Verständnis"),
      linkItem(page = Change.page, text = "Wandel"),
      linkItem(page = Tomorrow.page, text = "Morgen"),
      linkItem(page = Articles.page, text = "Essays")
    )


  def renderEN() =
    Fragment(
      linkItem(page = Landing.page, text = "Home"),
      linkItem(page = WhereAreWe.page, text = "Understanding"),
      linkItem(page = Change.page, text = "Change"),
      linkItem(page = Tomorrow.page, text = "Tomorrow"),
      linkItem(page = Articles.page, text = "Essays")
    )


}
