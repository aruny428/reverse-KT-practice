package ReverseKT

object case_classes extends App {

  case class Email(emailFrom: String, subject: String)
  case class SMS(fromNumber: String, message: String)

  val firstSms = SMS("12345", "Hello!")
  val secondSms = SMS("12345", "Hello!")

  if (firstSms == secondSms) {
    println("They are equal")
  }

  val AnySms = firstSms

  AnySms match {
    case SMS("12345","Hello!") => println(s"Got an sms from : ${firstSms.fromNumber}")
    case _=> println("did not get any sms")
  }

}
