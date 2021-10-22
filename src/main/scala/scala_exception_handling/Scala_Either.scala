package scala_exception_handling

def AgeValidation(age: Int): Either[String, String] = {
  if (age < 18) {
    Left("Age is not valid")
  } else {
    Right("Age is valid")
  }
}

object Scala_Either {
  def main(args: Array[String]): Unit = {
    println(AgeValidation(15))
    println(AgeValidation(25))
  }
}
