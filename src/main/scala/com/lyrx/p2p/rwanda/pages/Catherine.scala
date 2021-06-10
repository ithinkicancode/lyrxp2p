package com.lyrx.p2p.rwanda.pages

import com.lyrx.p2p.{AppProps, AppState}
import com.lyrx.p2p.rwanda.MSection
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Fragment
import slinky.web.html._

object Catherine {
  val page = "catherine.html"
}

@react class Catherine extends Component {

  type State = AppState
  type Props = AppProps

  def initialState = AppState("")


  def render() = Fragment(
    section(id := "one")(
      div(className := "inner")(
        header(className := "major",
          h2("Catherine Mukangwije")
        )
      )),
    section(id := "two", className := "spotlights")(
      MSection(props, "WithBananas.jpeg",
        """
          I live in MURAMBI Sector, KARONGI District, and WESTERN Province in RWANDA.
          I was born into a family that love Agriculture and that made me fall in love of it!
          I am rearing now 2 cows, 2 pigs, 3 goats and 5 chickens.


          """),
      MSection(props, "WithCows.jpeg",
        """

          In Agriculture, I like to cultivate Bananas, fruit trees,
          Vegetables and various food crops. This allowed me to set up a
          small shop so that I could find the market for my Agriculture and animal
          farming production, including dissert bananas, cooking bananas, Vegetables,
          eggs and milk. The other remaining production is used in feeding my family.



          """),
      MSection(props, "InTheShop3.jpeg",
        """

          Some kitchen wastes and Agriculture by-products are used to feed my pigs.
           All those activities give me the possibility to support my family
           because we do not have any other source of income like a salary for example.

          """),
      MSection(props, "FeedingCow2.jpeg",
        """

We can get food, clothes, we can even get medical care and we have the ability to pay school
 fees for our children. For example, I was able to pay school fees of my Son
 when he was studying in the university and now, he has graduated.


          """),
      MSection(props, "WithPigs3.jpeg",
        """

In our family, we are proud of our achievements from Agriculture and Animal farming activities.
 I encourage other women to work especially to do Agriculture and Animal farming
 activities as those activities do not require much investment and can produce more.
 They (women) can be able to feed their families, they can buy clothes, they can have
 access to medical care, and they can pay school fees for their children and contribute to
  the development of our country.



          """),



    ))


}
