package views.form

import views.html.helper.{FieldElements, FieldConstructor}
import views.html.form.fieldCtor

object HorizontalForm {

  implicit val horizontalFormField = new FieldConstructor {
    def apply(field: FieldElements) = fieldCtor(field)
  }

}
