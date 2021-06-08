package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.swissworld.AppProps
import com.lyrx.p2p.{AppState, MWizard}
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


object FreeConsulting {
  val page: String = "calendly.html"
}

@react class FreeConsulting extends Component {


  type Props = AppProps
  type State = AppState
  override def initialState: State = AppState("")



  def termin() = p(
    a(href := "https://calendly.com/a-weinmann/30min",
      target := "_blank"
    )(
      span(className := "icon solid alt fa-calendar")(


        s" ${if( props.isGerman())
          " Vereinbaren Sie einen Termin"
        else
          " Schedule an appointment"  }"



      )
    ))


  def myurl()="md/swissworld/consulting.md"

  def myimg()="images/swissworld/meeting.jpg"

  def renderDE() = section(id := "one")(
    MWizard(props,
      url = myurl(),
      imageUrls= Seq(myimg()),
      titleOpt=None,
      isDual = true),
    div(className := "inner")(termin())
  )


  def renderEN() = section(id := "one")(
    MWizard(props,
      url =  myurl(),
      imageUrls=Seq(myimg()),
      titleOpt=None,
      isDual = true),
    div(className := "inner")(termin())
  )

  def render() = if (props.isGerman()) renderDE() else renderEN()



}
