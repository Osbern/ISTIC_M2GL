package controllers

import util.Commons._
import play.api.mvc._
import models.OPowerService
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.libs.ws.WS

object Application extends Controller with Authentication {

  // Reference to the OPower service
  lazy val opower = OPowerService()

  /**
   * Show the dashboard of a user
   */
  val index = Authenticated { username =>
    request =>
      Ok(views.html.index(username))
  }

  def loginForm: Form[(String, String)] =
    Form(tuple("name" -> nonEmptyText,
    			"pwd" -> text.verifying(p => p.length() >= 4)))

  /**
   * Authenticate the user
   */
  val authenticate = Action { implicit request =>
    /*
   * Check if data from the form submission can authenticate the user
   * TODO Modify this function to call your service
   */
    def checkAuthentication(name: String, pwd: String): Boolean = {
      (name == "toto" && pwd == "tata")
    }

    loginForm.bindFromRequest.fold(
      {
        case error =>
          BadRequest(views.html.login(error.withGlobalError("Error: Invalid user name or password format")))
      },
      {
        case (username, password) =>
          if (checkAuthentication(username, password)) {
            signingIn(username)(Redirect("/"))
          } else {
            BadRequest(views.html.login(loginForm.withGlobalError("Error: Wrong user or password")))
          }
      })
  }

  /**
   * Show the login page
   */
  val login = Action { request =>
    Ok(views.html.login(loginForm))
  }

  /**
   * Sign out the user
   */
  val logout = Action { implicit request =>
    signingOut(Ok(views.html.login(loginForm.withGlobalError("You are now logged out !"))))
  }

  val onUnauthenticated = Redirect("/login")

  /**
   * Work with PVWatts (http://developer.nrel.gov/doc/pvwatts)
   */
  val askPvwatts = Authenticated { username =>
    request =>
      val userAddress = "WallopsSta"
      val pvwattsP = WS.url("http://developer.nrel.gov/api/georeserv/app/sam/pvwatts.json")
        .withQueryString(
          "api_key" -> "22a4ea01fcb2e05924818937b986486f12965660",
          "address" -> userAddress,
          "system_size" -> "42",
          "timeframe" -> "monthly").get()
     val json = pvwattsP.map(_.json)
     //val cost = (json \ "outputs" \ "ann_kwh_yr").asOpt[String]
     println(json)
     Ok(views.html.index(username))
  }
}