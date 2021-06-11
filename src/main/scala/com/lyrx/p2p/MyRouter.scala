package com.lyrx.p2p

import slinky.reactrouter.ReactRouterDOM.Router
import slinky.web.html.div
import vision.id.rrd.facade.history.mod.{Action, History, Location}
import vision.id.rrd.facade.reactRouterDom.components.Route
import vision.id.rrd.facade.reactRouterDom.{mod => react}

object MyRouter {

  def doit()={


    val h: History[Nothing] = react.useHistory()


    h.listen((e1,e2)=>{
      val location: Location[Nothing] = e1;
      val action: Action = e2;


    })

    // Route(div)
  }

}
