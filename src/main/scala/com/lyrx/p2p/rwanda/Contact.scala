package com.lyrx.p2p.rwanda

import com.lyrx.p2p.{AppProps, AppState}
import com.lyrx.p2p.Helpers.mail
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


object Contact {
  val mail = "contact@thegreatescape.institute"
}
@react class Contact extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")



  def render() = if (props.isGerman()) renderDE() else renderEN()




  def renderDE() = {


      article(

      header(className:="major")( h3(mail(
        mailAddress = Contact.mail,
        subject = "Frauen%20in%20Ruanda",
        text = " Kontakt")),
        span(className := "icon solid alt fa-envelope")(
         mail(mailAddress = Contact.mail,
           subject = "Frauen%20in%20Ruanda",
           text=Contact.mail)),


      )

    )
  }

  def renderEN() =  article(
    header(className:="major")(h3(mail(
      mailAddress = Contact.mail,
      subject = "Women%20in%20Rwanda",
      text = " Contact")),
      span(className := "icon solid alt fa-envelope")(
        mail( mailAddress = Contact.mail,
          subject = "Women%20in%20Rwanda",
          text = Contact.mail)),

    )

  )


}
