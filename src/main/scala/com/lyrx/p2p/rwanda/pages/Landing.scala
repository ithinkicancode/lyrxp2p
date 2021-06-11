package com.lyrx.p2p.rwanda.pages

import com.lyrx.p2p.{AppProps, AppState, MArticle}
import com.lyrx.p2p.rwanda.{Contact, Main}
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
        pars = Seq("A woman who can be proud of herself."),
        aPage = Catherine.page ),
    MArticle(action = (()=>Main.toPage(props,  Claudine.page)),
      text = "Claudine",
      pars = Seq("A woman never seen before."),
      aPage = Claudine.page),
    MArticle(action = (()=>Main.toPage(props,  Francine.page)),
      text = "Francine",
      pars = Seq("[TODO]"),
      aPage = Francine.page),
    MArticle(action = (()=>Main.toPage(props,  Charlotte.page)),
      text = "Charlotte",
      pars = Seq("[TODO]"),
      aPage = Charlotte.page),




  )


}
