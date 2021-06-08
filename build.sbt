enablePlugins(WebScalaJSBundlerPlugin,ScalaJSBundlerPlugin,ScalablyTypedConverterPlugin)

name := "lyrxp2p"
scalaVersion := "2.13.2"

Compile / npmDependencies ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1",
  "react-proxy" -> "1.1.8",
  "showdown" -> "1.9.1",
  "@types/showdown" -> "1.9.3")

stIgnore ++= List("react","react-dom","react-proxy")



Compile / npmDevDependencies ++= Seq(
  "file-loader" -> "6.0.0",
  "style-loader" -> "1.2.1",
  "css-loader" -> "3.5.3",
  "html-webpack-plugin" -> "4.3.0",
  "copy-webpack-plugin" -> "5.1.1",
  "webpack-merge" -> "4.2.2"
)

libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.6.5"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.5"
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.1" % Test

scalacOptions += "-Ymacro-annotations"

webpack / version   := "4.43.0"
startWebpackDevServer / version  := "3.11.0"
webpackResources := baseDirectory.value / "webpack" * "*"
Assets / pipelineStages   := Seq(scalaJSPipeline)
resolvers += Resolver.bintrayRepo("oyvindberg", "converter")

fastOptJS / webpackConfigFile   := Some(baseDirectory.value / "webpack" / "webpack-fastopt.config.js")
fastOptJS / webpackDevServerExtraArgs   := Seq("--inline", "--hot")
fastOptJS / webpackBundlingMode   := BundlingMode.LibraryOnly()

fullOptJS / webpackConfigFile   := Some(baseDirectory.value / "webpack" / "webpack-opt.config.js")

Test / webpackConfigFile   := Some(baseDirectory.value / "webpack" / "webpack-core.config.js")
Test / requireJsDomEnv   := true

addCommandAlias("dev", ";fastOptJS::startWebpackDevServer;~fastOptJS")
addCommandAlias("build", "fullOptJS::webpack")
