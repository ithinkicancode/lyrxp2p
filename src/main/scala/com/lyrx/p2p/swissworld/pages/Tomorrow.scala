package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.AppState
import com.lyrx.p2p.swissworld.{AppProps, Phrases}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object Tomorrow {
  val page: String = "value.html"
}


@react class Tomorrow extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def renderDE() = Fragment(

    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Morgen")
    ),

      ul(
        li(
          strong(s"${Phrases.COMPANY}"),
          """
             bietet IT-Beratung für den FinTech-Bereich von morgen. Das Angebot
             ist modular, flexibel und ausbaufähig. Wir beraten den Kunden individuell
             und mit Bezug auf die neuesten technischen Entwicklungen, insbesondere
             im Bereich Blockchain und Kryptowährungen."""
        ),
        li(
          strong(s"${Phrases.COMPANY}"),
          " bildet ",
          em("Remote Teams"),
          ", bestehend aus internationalen Experten, die ihrer Aufgabe auch gewachsen sind."
        ),
        li("Jedes ",
          em("Remote Team"),
          " wird ",
          strong(" aus der Schweiz heraus "),
          """ geleitet. Deshalb ist das Projektmanagement stets direkt vor Ort ansprechbar. """
        ),
        li(strong(s"${Phrases.COMPANY}"),
          """ minimiert die Kosten und profitiert von weltweit unterschiedlichen Lebenshaltungskosten,
              ohne dass die Vorteile des Schweizer Standorts verloren gehen."""
        )
      ),
      p(strong(s"${Phrases.COMPANY}"),
        """ bietet IT-Beratung für die Welt von morgen an. Skalierbar von kleinsten Anfängen aufwärts,
           bei vergleichsweise niedrigen Kosten, unabhängig von
      Schweizer Gehaltsstandards."""
      ),
      h2(id := "unique-selling-proposition", "Mehrwert"),
      p(
        """Viele Anbieter arbeiten zwar bereits mit Offshore-Teams
          -- haben aber die "altbekannten" Probleme:"""
      ),
      ul(
        li("Oft müssen Unternehmen im Ausland gegründet werden"),
        li("Das technische Projektmanagement ist im Ausland"),
        li("Bürokratie im Ausland ist hinderlich"),
        li("Büros im Ausland sind erforderlich"),
        li("Festangestellte Mitarbeiter im Ausland sind erforderlich")
      ),
      p(
        strong(s"${Phrases.COMPANY} "),
        strong("überwindet die Grenzen"),
        ", aber umgeht sie nicht, denn die Arbeit der Zukunft wird ",
        strong(
          """ weltweit verteilt stattfinden.""")
      ),
      p(
        """
           Natürlich hört sich diese Vision zunächst unrealistisch an: Sprachbarrieren, Nationalismus, Bürokratie
            etc. ..."""),
      p(
        """Wir glauben aber, dass gewisse Veränderungen unaufhaltsam sind und deshalb
           nicht ignoriert werden können und sollen. Wer sich an sie anpasst, wird künftig
           mit dem Strom schwimmen. Hinzu kommt, dass die jüngste Pandemie den Wandel nur noch verstärkt hat.
           Das Arbeitsleben wird nicht mehr zur Vor-Corona-Norm zurückkehren können.
            Wir ziehen die Konsequenzen.""")



  )

  def renderEN() = Fragment(
    header(className := "major",
      h2(s"${Phrases.COMPANY}"),
      h3("Tomorrow")
    ),

    ul(
      li(
        strong(s"${Phrases.COMPANY}"),
        """is offering services and consulting in software development for the FinTech
        area. Services will be offered as a modular system, flexible  and extensable."""
      ),
      li("For every assignment, ",
        strong(s"${Phrases.COMPANY}"),
        " will exclusively set up a ",
        em("Remote Team "),
        "consisting of the best international experts fit to do the best job they can do."
      ),
      li("Every",
        em(" Remote Team"),
        " will be managed locally ",
        strong("in Switzerland"),
        """. Single point of contact for
        the customer will always be a """,
        strong("swiss based project manager"),
        ". He ",
        em("“speaks the language”"),
        ", is accessable",
        em("“in person and for real”"),
        " and he conforms to Swiss standards."
      ),
      li("Except for management, ",
        strong(s"${Phrases.COMPANY}"),
        """ does minimize permant employments, instead working
        with independent and """,
        em("“free”"),
        " experts from all over the world."
      )
    ),
    p("Thus ",
      strong(s"${Phrases.COMPANY}"),
      """ will offer IT services fit for the future, scaling up from small to large
    while keeping costs much lower than any competitor."""
    ),
    h2(id := "unique-selling-proposition", "Unique Selling Proposition"),
    p(
      """Competitors often work with remote teams located in one or several countries. Teams consist of permanent employees
    and are managed both remote and locally “""",
      em("on premise"),
      """”. The pain points are obvious and always imply all sorts of
    extra costs and effort:"""
    ),
    ul(
      li("Offshore company needed"),
      li("Offshore Management needed"),
      li("Offshore compliance needed"),
      li("Offshore employees needed, team is difficult to scale up or down"),
      li("Offshore offices needed")
    ),
    p(
      strong(s"${Phrases.COMPANY}"),
      " will stay ",
      strong("borderless wherever possible"),
      ". It is ",
      strong(
        """evident
    and inevitable"""),
      " that future work will ",
      strong("no longer be tied"),
      " to locations or to nations."
    ),
    p(
      """We know that our ideas do sound somehow utopian and far fetched. Nationalism is on the rise, all sorts of political
    and regulatory restrictions are still in the way. The language barrier and cultural differences cannot be
    ignored."""),
    p(
      """But we believe that all these conditions are changing and improving in an ever increasing pace. We have just seen
    that surprising changes in our working culture can be triggered by a pandemic nobody foresaw. Going to work will
    never be the same after that! To us it is clear what path the current social developments are leading us on. We want
    to draw consequences now.""")


  )

  def render() = section(id := "one")(
    div(className := "inner")(
      span(className := "image main")(img(src := "images/swissworld/addedvalue.jpg")),
      if (props.isGerman()) renderDE() else renderEN()
    ))


}
