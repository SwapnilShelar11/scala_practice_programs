package function_practice

object HigherOrderFunction {
  def main(args: Array[String]) = {

    //Passing a Function as Parameter in a Function
    def add(a: Int, b: Int): Int = a + b

    def multiplication(x: Int, addFunc: Int): Int = x * addFunc

    println(multiplication(10, add(10, 20)))

    //Scala Anonymous Function
    //Anonymous function is a function that has no name but works as a function.
    var add1 = (a: Int, b: Int) => a + b
    var add2 = (_: Int) + (_: Int)

    println(add1(10, 10))
    println(add2(10, 10))

    //Scala Function Currying
    //technique of transforming a function that takes multiple arguments into a function that takes a single argument.

    def addition(a: Int)(b: Int) = a + b

    println(addition(10)(20))

    val valAdd = addition(10) _
    val result = valAdd(20)
    println(result)

    //Scala Function with Variable Length Parameters

    def addNumbers(args: Int*) = {
      var sum = 0;
      for(a <- args) sum+=a
      sum
    }

    println(addNumbers(10,20,3,0))

  }
}
