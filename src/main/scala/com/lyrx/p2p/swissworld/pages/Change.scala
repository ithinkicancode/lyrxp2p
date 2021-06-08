package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.Helpers._
import com.lyrx.p2p.AppState
import com.lyrx.p2p.swissworld.Main.showTomorrow
import com.lyrx.p2p.swissworld.{AppProps, Phrases}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._



object Change{
  val page:String= "concept.html"
}



@react class Change extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def renderDE() = Fragment(

    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Wandel")
    ),

    p(
      strong("Die Schweiz ist ein idealer Ort"),
      ", um bei Veränderungen voran zu gehen."
    ),
    ul(
      li("Sie ist ein ",
        strong("multi-kulturelles Land "),
        """mit einer langen Tradition in der Pflege außenwirtschaftlicher Beziehungen.
           Auch bei der Integration anderer Kulturen und neuer Technologien
           ist sie gut.
          """)
      ,
      li("Sie hat ",
        strong("eine hervorragende Infrastruktur"),
        """ und ist mit dem Rest der Welt eng verbunden."""
      ),
      li("Die Schweiz bietet",
        strong(" hohe Lebensqualität für hervorragende Mitarbeiter.")
      ),
      li(
        """In der Schweiz kann der Gesetzgeber
                  """,
        strong(
          """schneller und effektiver auf gesellschaftlichen Wandel
                  reagieren"""),

        """, als das in größeren Ländern der Fall sein kann."""))
    ,
    p("Und ", a(href :=  Phrases.toHash(Tomorrow.page), onClick := showTomorrow(props))("morgen")," die ganze Welt ...")

  )


  def renderEN() = Fragment(

    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Change")
    ),

    p(
      strong("Switzerland is a good place to start change."
    )),
    ul(
      li("It is a ",
        strong("multi-cultural"),
        """ country with a long tradition to incorporate influences from a large
        number of countries."""
      ),
      li("There is ",
        strong("well established  infrastructure"),
        """, and it is deeply connected to the rest of the
        world."""
      ),
      li("There are ",
        strong("good infrastructure and good living conditions"),
        " for gifted people"
      ),
      li("Its ",
        strong("regulatory system can adapt better "),
        """than that of larger countries to world-wide economical and social
        change"""
      )
    )
    ,
    p("And ", a(href := Phrases.toHash(Tomorrow.page), onClick := showTomorrow(props))("tomorrow")," the whole world ...")
  )


  def render() = section(id := "one")(
    div(className := "inner")(
      span(className := "image main")(img(src := "images/swissworld/ideas.png")),
      if (props.isGerman()) renderDE() else renderEN()
    ))


}
