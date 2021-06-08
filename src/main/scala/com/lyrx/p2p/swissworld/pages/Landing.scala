package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.swissworld.Phrases._
import com.lyrx.p2p.swissworld.{AppProps, Contact, Main}
import com.lyrx.p2p.{AppState, MArticle}
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object Landing{
  val page:String= "landing.html"

}

@react class Landing extends Component {

  type State = AppState
  type Props = AppProps

  def initialState= AppState("")


  def fragments(titles: Seq[String], parsArray: Seq[Seq[String]]) = Fragment(
    Contact(props)
    ,
    MArticle(action  = (()=>Main.toPage(props,  WhereAreWe.page)),  text = titles(0), parsArray(0)),
    MArticle(action = (()=>Main.toPage(props,   Change.page)),  text = titles(1), parsArray(1)),
    MArticle(action = (()=>Main.toPage(props, Tomorrow.page)),  text = titles(2), parsArray(2)),

  )

  def renderDE() = fragments(Seq(
    s"${M("de")("topic1")}",
    s"${M("de")("topic2")}",
    s"${M("de")("topic3")}"),
    Seq(
      Seq("""... dass nichts so bleibt, wie es ist,""",
        """ denn wie's mal war, wird's nie mehr werden."""),
      Seq(
        """Heute die Schweiz ...
          ""","""
          ...  morgen die ganze Welt.
          """),
      Seq(
        """
        Wir integrieren ihre Geschäftsprozesse

        ""","""
        in die vernetzte Welt von morgen.
        """
      )))


  def renderEN() = fragments(
    Seq(
      s"${M("en")("topic1")}",
      s"${M("en")("topic2")}",
      s"${M("en")("topic3")}"),
    Seq(
      Seq("""
       Nothing stays the same.

      """,
      """
       It will never  be the way it used to be.
      """),
      Seq("""
      Today it is just Switzerland.""",
      """
      Tomorrow it will be the whole world."""),
      Seq("""

      We will integrate your business processes


      into tomorrow's distributed environments.

      """)))


  def render() = section(id := "one", className := "tiles")(
    if (props.isGerman()) renderDE() else renderEN()
  )


}
