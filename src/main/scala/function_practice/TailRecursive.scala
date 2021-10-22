package function_practice
def factorial(n: Int): Int =
{
  if (n == 1)
    1
  else
    n * factorial(n - 1)
}
object TailRecursive {

  // Main method
  def main(args:Array[String]):Unit=
  {
    println(factorial(5))
  }
}

