package com.lyrx.p2p.swissworld.pages

import com.lyrx.p2p.swissworld.AppProps
import com.lyrx.p2p.{AppState, MWizard}
import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


object Scalability{

  val page="scalability.html"


}

@react class Scalability extends Component {


  type Props = AppProps
  type State = AppState
  override def initialState: State = AppState("")

  def myurl()="md/swissworld/scaling.md"
  def myimg()="images/swissworld/scalability.jpg"



  def render() = section(id := "one")(
    MWizard(props,
      url =  myurl(),
      imageUrls=Seq(myimg()),
      titleOpt=None,
      isDual = true),
  )


}
