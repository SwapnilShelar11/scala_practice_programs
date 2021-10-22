package scala_exception_handling

def division(a: Int, b: Int): Double = {
  a / b
}

object ArithmaticExceptionHandle {
  def main(args: Array[String]): Unit = {
    try {
      println("Program befor Exception execute")
      division(100, 0)
      println("Rest of program will execute")
    } catch {
      case e: ArithmeticException => println("Found Arithmatic Exception " + e)
    } finally {
      println("Finammy block will always execute")
    }
  }
}
