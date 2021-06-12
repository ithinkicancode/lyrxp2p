package com.lyrx.p2p

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


object Essay{
  def createEssay(a: AppProps,name:String,aApp:String,tOpt:Option[String]) = create(
    a,
    name,
    aCategory = "essays",
  app = aApp,
    tOpt)

  def create(a: AppProps,name:String,aCategory:String,app:String,tOpt:Option[String]) =
    Essay(
      appProps  = a,
      mdUrl = s"md/${app}/${aCategory}/${Helpers.toName(name)}.md",
      Seq(Some(s"images/${app}/${aCategory}/${Helpers.toName(name)}.jpg")),
      aTitleOpt = tOpt
    )



}

@react class Essay extends Component {


  case class Props (appProps: AppProps,mdUrl:String,maybeImages:Seq[Option[String]],aTitleOpt:Option[String])
  type State = AppState
  override def initialState: State = AppState("")


  def render() = section(id := "one")(
    MWizard(props.appProps,
      url =  props.mdUrl,
      maybeImages=props.maybeImages,
      titleOpt=props.aTitleOpt,
      isDual = true),
  )


}
