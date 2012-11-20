package controllers

import play.api.mvc._
import play.api.mvc.BodyParsers.parse
import scala.Some

trait Authentication {

  val USER_KEY = "username"

  def Authenticated[A](parser: BodyParser[A])(action: String => Request[A] => Result) = Action(parser) { request =>
    request.session.get(USER_KEY) match {
      case Some(username) => action(username)(request)
      case None => onUnauthenticated
    }
  }

  /**
   * Generate an action that will be executed only if there’s a signed in user in the session. If there is no user, `onUnauthenticated` is called.
   * Example:
   * {{{
   *   Authenticated { username => request =>
   *     Ok("Hello, " + username + "!")
   *   }
   * }}}
   * @param action Authenticated action
   */
  def Authenticated(action: String => Request[AnyContent] => Result): Action[AnyContent] = Authenticated(parse.anyContent)(action)

  /**
   * Sign a user in the session.
   * Example:
   * {{{
   *   Action { implicit request =>
   *     val username = "turing"
   *     signingIn(username)(Ok("You’ve been signed in"))
   *   }
   * }}}
   * @param result HTTP result holding the session
   * @param username Name of the user
   * @param request HTTP request holding the session
   */
  def signingIn(username: String)(result: PlainResult)(implicit request: RequestHeader) = result.withSession(request.session + (USER_KEY -> username))

  /**
   * Sign a user out of the session
   * Example:
   * {{{
   *   Action { implicit request =>
   *     signingOut(Ok("You’ve been signed out"))
   *   }
   * }}}
   * @param result HTTP result holding the session
   * @param request HTTP request holding the session
   */
  def signingOut(result: PlainResult)(implicit request: RequestHeader) = result.withSession(request.session - USER_KEY)

  def onUnauthenticated: Result

}
