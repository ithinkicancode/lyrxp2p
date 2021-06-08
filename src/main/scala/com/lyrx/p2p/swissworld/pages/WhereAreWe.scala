package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.Helpers._
import com.lyrx.p2p.AppState
import com.lyrx.p2p.swissworld.Main.showChange
import com.lyrx.p2p.swissworld.{AppProps, Phrases}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object WhereAreWe {
  val mail = "enna@mailbox.org"
  val page: String = "where.html"
}

@react class WhereAreWe extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def renderDE() = Fragment(

    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Wo wir sind")
    ),
    ul(
      li(
        """Softwareentwicklung findet in internationalen Teams statt, die """,
        "auf mehrere Standorte verteilt",
        " sind. -- ", strong(mail(
          mailAddress = WhereAreWe.mail,
          subject = Phrases.M.get("de").get("title"),
        text = """Wir steuern das.""")),

      ),
      li("Qualifizierte Arbeitskräfte sind knapp,  dennoch sind Ländergrenzen ",
        """oft ein unüberwindbares Hindernis""", ". -- ", strong(mail(
          mailAddress = WhereAreWe.mail,
          subject = Phrases.M.get("de").get("title"),
          text = "Wir finden Wege."
        ))
      ),
      li("Das ",
        """ "Remote Office" """,
        """ ist fast überall Wirklichkeit --
           die """, italic("""Ortsgebundenheit"""),
        """
           von Arbeitsverhältnissen nicht mehr zeitgemäß. -- """, strong(
          mail(
            mailAddress = WhereAreWe.mail,
            subject =   Phrases.M.get("en").get("title"),
          text =   "Wir wissen das."
          ))
      ),
      li("""Kryptowährungen und DeFi ("Distributed Finance")""",
        """"  werden  eine wesentlich bessere finanzielle Infrastruktur ermöglichen,""",
        " sobald sie international reguliert sind. -- ",
        strong(mail(
          mailAddress = WhereAreWe.mail,
          subject =   Phrases.M.get("en").get("title"),
        text = """Eine Riesenchance für die Schweiz."""

        ))
      )
    ),
    p("Und nun kommt der ", a(href := Phrases.toHash(Change.page), onClick := showChange(props))("Wandel"))

  )

  def renderEN() = Fragment(
    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Where we are")
    ),
    ul(
      li(
        """In software development teams are international and spread over multiple locations.""",
        " sind. -- ", strong("""We help you organize"""), "."

      ),
      li(
        """
          Skilled workers are scarce, but national
          borders are often an insurmountable obstacle.""", " -- ", strong("We find ways.")
      ),
      li("Das ",
        """ "Remote Office" is a reality almost everywhere --
            """, italic("""Locality"""),
        """ of employment relationships is no longer up-to-date. -- """, strong("We know that.")
      ),
      li(
        """Cryptocurrencies and DeFi ("Distributed Finance")
          will enable a much better financial infrastructure as soon as
           they are internationally regulated. --""",
        strong("""This is a huge opportunity for Switzerland.""")
      )
    )
    ,
    p("Here comes the ", a(href := Phrases.toHash(Change.page), onClick := showChange(props))("change"))

  )

  def render() = section(id := "one")(
    div(className := "inner")(
      span(className := "image main")(img(src := "images/swissworld/leuchtturm.png")),
      if (props.isGerman()) renderDE() else renderEN()
    ))


}
