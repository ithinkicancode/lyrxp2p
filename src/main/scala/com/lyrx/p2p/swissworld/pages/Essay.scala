package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.swissworld.{AppProps, Phrases}
import com.lyrx.p2p.{AppState, MWizard}
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


object Essay{
  def createEssay(a: AppProps,name:String) = create(
    a,
    name,
    "essays")

  def create(a: AppProps,name:String,aCategory:String) =
    Essay(
      appProps  = a,
      mdUrl = s"md/swissworld/${aCategory}/${Phrases.toName(name)}.md",
      Seq(s"images/swissworld/${aCategory}/${Phrases.toName(name)}.jpg")
    )



}

@react class Essay extends Component {


  case class Props (appProps: AppProps,mdUrl:String,images:Seq[String])
  type State = AppState
  override def initialState: State = AppState("")


  def render() = section(id := "one")(
    MWizard(props.appProps,
      url =  props.mdUrl,
      imageUrls=props.images,
      titleOpt=None,
      isDual = true),
  )


}
