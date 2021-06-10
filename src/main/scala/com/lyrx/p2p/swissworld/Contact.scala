package com.lyrx.p2p.swissworld

import com.lyrx.p2p.{AppProps, AppState, Helpers}
import com.lyrx.p2p.Helpers.mail
import com.lyrx.p2p.swissworld.pages.{FreeConsulting, WhereAreWe}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.web.html._

import scala.scalajs.js.Dynamic.literal

@react class Contact extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()

  def mmail(alang:String,txt:String) = mail(
    mailAddress = WhereAreWe.mail,
    subject = Phrases.M.get(alang).get("title"),
    text = txt
  )


  def consulting(s:String)=
    span(className := "icon solid alt fa-calendar")(
      a(//href := "https://calendly.com/a-weinmann/30min",
        href := Helpers.toHash(FreeConsulting.page),
        onClick :=((e)=>{
          e.stopPropagation()
          Main.toPage(props,FreeConsulting.page)
        })
      )(
        s" ${s}"))
  def renderDE() = {


    article(

      header(className := "major")(h3(
        mmail("de", "IT-Beratung für  Jetzt")),
        consulting("Sich beraten lassen"), br(), br(),
        span(className := "icon solid alt fa-envelope")(mmail("de", " Schreiben")), br(), br(),
        span(className := "icon solid alt fa-phone")(" Telefonieren: +41 76 25 76 961"), br(), br(),
        span(className := "icon solid alt fa-home")(" Schneckenpost: "),
        span(className := "icon solid alt fa-home", style := literal(display = "none"))(""),
        span()(" Weidstrasse 8, CH-8122 Binz")
      )

    )
  }

  def renderEN() = article(
    header(className := "major")(
      h3(mmail("en","Reach out to us")),
      consulting("Get Consulting"), br(), br(),
      span(className := "icon solid alt fa-envelope")(mmail("en"," Write")), br(), br(),
      // span(className := "icon solid alt fa-phone")(" +41 76 25 76 961"), br(), br()
    )

  )


}
