package com.lyrx.p2p

import com.lyrx.p2p.Helpers._
import slinky.core._
import slinky.core.annotations.react


import scala.concurrent.ExecutionContext


@react class MarkdownLoader extends Component {
  case class Props(url: String)

  case class State(text: String)

  implicit val executionContext: ExecutionContext = ExecutionContext.global

  def initialState = State("""[... loading ... """)


  def load()=loadString(props.url).map(
    (s: String) => setState(State(s)))

  override def componentDidUpdate(prevProps: Props, prevState: State): Unit = {

    if (
      (prevProps.url != props.url)
        ||
        (state.text != prevState.text)
    )
    load()
  }
  override def componentDidMount(): Unit = load()
  override def componentWillUnmount(): Unit = {

  }



  def render() = state.text.md()


}
