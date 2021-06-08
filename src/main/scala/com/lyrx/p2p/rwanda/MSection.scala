package com.lyrx.p2p.rwanda

import com.lyrx.p2p.AppState
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


@react class MSection extends Component {

  type State = AppState

  case class Props(appProps: AppProps,
                   pic: String,
                   text: String
                  )


  def initialState = AppState("")


  def render() = section(
    a(href :="",className:="image")(
    img(src := s"images/rwanda/${props.pic}", data - "position" := "center center")),
    div(className := "content",
      div(className := "inner")(
        p(props.text),
      )
    )
  )


}
