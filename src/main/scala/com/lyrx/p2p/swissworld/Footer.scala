package com.lyrx.p2p.swissworld

import com.lyrx.p2p.AppState
import com.lyrx.p2p.swissworld.pages.WhereAreWe
import slinky.core.Component
import slinky.core.annotations.react
import slinky.web.html._
import slinky.web.html.{className => cls}

@react class Footer extends Component {
  type Props = AppProps
  type State = AppState


  def initialState = AppState("")


  def render() = if (props.isGerman()) renderDE() else renderEN()


  def renderDE() = div(cls := "inner",
    ul(cls := "icons",
      li(
        a(href := s"mailto:${WhereAreWe.mail}?subject=Swiss%20World%20Teamup", className := "icon solid alt fa-envelope",
          span(cls := "label", "Mail")
        )
      )
      ,
      li(
        a(href := "https://twitter.com/lyrx2010", cls := "icon brands alt fa-twitter",
          span(cls := "label", "Twitter")
        )
      ),
      li(
        a(href := "https://www.facebook.com/AlexanderWeinmann65/", cls := "icon brands alt fa-facebook-f",
          span(cls := "label", "Facebook")
        )
      ),
      li(
        a(href := "https://www.instagram.com/alexbinz65/", cls := "icon brands alt fa-instagram",
          span(cls := "label", "Instagram")
        )
      ),
      li(
        a(href := "https://github.com/lyrx", cls := "icon brands alt fa-github",
          span(cls := "label", "GitHub")
        )
      ),
      li(
        a(href := "https://www.linkedin.com/in/alexander-weinmann-5ba898106/", cls := "icon brands alt fa-linkedin-in",
          span(cls := "label", "LinkedIn")
        )
      )
    )
  )

  def renderEN() = div(cls := "inner",
    ul(cls := "icons",
      li(
        a(href := "https://twitter.com/lyrx2010", cls := "icon brands alt fa-twitter",
          span(cls := "label", "Twitter")
        )
      ),
      li(
        a(href := "https://www.facebook.com/AlexanderWeinmann65/", cls := "icon brands alt fa-facebook-f",
          span(cls := "label", "Facebook")
        )
      ),
      li(
        a(href := "https://www.instagram.com/alexbinz65/", cls := "icon brands alt fa-instagram",
          span(cls := "label", "Instagram")
        )
      ),
      li(
        a(href := "https://github.com/lyrx", cls := "icon brands alt fa-github",
          span(cls := "label", "GitHub")
        )
      ),
      li(
        a(href := "https://www.linkedin.com/in/alexander-weinmann-5ba898106/", cls := "icon brands alt fa-linkedin-in",
          span(cls := "label", "LinkedIn")
        )
      )
    )
  )


}
