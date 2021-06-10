package com.lyrx.p2p

case class AppProps(currentLang: String, page: String) {

  def isGerman(): Boolean = currentLang.toLowerCase.startsWith("de")


  def switchLanguage() =
    if (isGerman())
      this.copy(currentLang = "EN")
    else
      this.copy(currentLang = "DE")


}
