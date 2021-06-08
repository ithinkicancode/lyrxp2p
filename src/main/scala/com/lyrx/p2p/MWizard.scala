package com.lyrx.p2p

import com.lyrx.p2p.Helpers._
import com.lyrx.p2p.swissworld.AppProps
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.{Fragment, ReactElement}
import slinky.web.html._

import scala.concurrent.{ExecutionContext, Future}
import scala.scalajs.js


@react class MWizard extends Component {

  case class Props(appProps: AppProps, url: String, imageUrls: Seq[String], titleOpt: Option[String],isDual:Boolean)
  case class State(textOpt: Option[String], page: Int, pageCount: Int)
  override def initialState: State = State(textOpt = None, page = 0, pageCount = 0)

  override def componentDidMount(): Unit = loadData()

  def loadData(): Future[Unit] = loadString(
    props.url).map(s => {
    val strings: Array[String] = s.split("---")
    val newPageIndex = if (props.appProps.isGerman()) (
      (state.page * 2) //  0 2 4 6
      ) else (
      (state.page * 2) + 1 // 1 3 5 7
      )
    setState(state.copy(
      textOpt = Some(
        strings(newPageIndex)),
      pageCount = (strings.length / (if(props.isDual) 2 else 1)) - 1
    ))
  })(ExecutionContext.global)

  override def componentDidUpdate(prevProps: Props, prevState: State): Unit = if (
    (prevProps.appProps.currentLang != props.appProps.currentLang)
      ||
      (state.page != prevState.page)
  ) loadData()

  def nav() = {
    val maxPage: Int = state.pageCount
    val buttonPadding = "30px"
    val aPaddingTop = "30px"
    p(style :=js.Dynamic.literal(paddingTop = aPaddingTop))(
      a(href := "#",
        style := (if (state.page > 0)
          js.Dynamic.literal(
            borderBottom = "0px",
            paddingRight = buttonPadding
          )
        else
          js.Dynamic.literal(
            visibility = "hidden",
            borderBottom = "0px",
            paddingRight = buttonPadding))
        ,
        onClick := ((e) => {
          e.stopPropagation()
          e.preventDefault()
          setState(state.copy(page = state.page - 1))
        })
      )(
        span(className := "icon solid alt fa-backward")(
          s" ${""}"))
      ,

      span()(" "),


      a(href := "#",
        style := (if (state.page < maxPage)
          js.Dynamic.literal(borderBottom = "0px")
        else
          js.Dynamic.literal(visibility = "hidden", borderBottom = "0px"))
        ,
        onClick := ((e) => {
          e.stopPropagation()
          e.preventDefault()
          setState(state.copy(page = state.page + 1))
        })
      )(
        span(className := "icon solid alt fa-forward")(
          s" ${""}"))
    )
  }

  def currentImage()={
    val curOpt: Option[String] = props.imageUrls.lift(state.page)

     if(curOpt.isEmpty)
       props.imageUrls.lift(0)
     else
       curOpt
  }



  def render() = div(className := "inner")(
    nav(),
    currentImage().map((url:String)=>span(className := "image main")(img(src := url))),
    props.titleOpt.map(t=>if(state.page == 0)header(className := "major",
      h2(t),
    )else Fragment()):Option[ReactElement],
    state.textOpt.map(t => markdown(t)),
    nav(),

  )
}
