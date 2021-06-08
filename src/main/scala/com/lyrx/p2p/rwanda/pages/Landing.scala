package com.lyrx.p2p.rwanda.pages

import com.lyrx.p2p.{AppState, MArticle}
import com.lyrx.p2p.rwanda.{AppProps, Contact,Main}
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


object Landing{
  val page:String= "landing.html"

}

@react class Landing extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")






  def render() = section(id := "one", className := "tiles")(
    Contact(props),
      MArticle(
        action = (()=>Main.toPage(props,  Catherine.page)),
          text = "Catherine Mukangwije",
        pars = Seq("A woman who can be proud of herself.")),
    MArticle(action = (()=>Main.toPage(props,  Claudine.page)),
      text = "Claudine",
      pars = Seq("A woman never seen before.")),


  )


}
