package com.lyrx.p2p.rwanda.pages

import com.lyrx.p2p.{AppProps, AppState}
import com.lyrx.p2p.rwanda.MSection
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._


object Claudine {
  val page = "claudine.html"
}


@react class Claudine extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def render() = Fragment(
    section(id := "one")(
      div(className := "inner")(
        header(className := "major",
          h2("Claudine")
        )
      )),
    section(id := "two", className := "spotlights")(
      MSection(props, "claudine3.jpeg",
        """
I think I don't have a very long story my husband and I really like
 having a farm that is why once I got a job.

          """),
      MSection(props, "claudine5.jpeg",
        """
We have agreed to buy a small land in the village.

          """),
      MSection(props, "claudine6.jpeg",
        """

Then after we started by buying 2 pigs a female,
and a male after a short period they gave 5 small pigs
which I sold  to get chicken and 2 rabbits.
          """),
      MSection(props, "claudine9.jpeg",
        """

Now I'm waiting for all of them to produce and hopefully in coming year I will be having a big farm.

          """)



    ))


}
