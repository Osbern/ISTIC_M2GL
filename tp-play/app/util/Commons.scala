package util


object Commons {

  def ??? : Nothing = sys.error("Not (yet) implemented")
  type ??? = Nothing

  import play.api.data.Form
  import play.api.data.FormError

  implicit def formWithError[A](form: Form[A]) = new FormWithError(form)
  class FormWithError[A](form: Form[A]) {
    def withError(error: FormError): Form[A] = form.copy(errors = form.errors :+ error, value = None)
    def withError(key: String, message: String, args: Any*): Form[A] = withError(FormError(key, message, args))
    def withGlobalError(message: String, args: Any*) = withError(FormError("", message, args))
  }

}
