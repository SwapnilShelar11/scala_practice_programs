package function_practice

object RecursionObject {
  def main(args: Array[String]) = {
    var result = Multiplication(15, 3)
    println(result)
  }
}
def Multiplication(a:Int, b:Int):Int = {
  if(b == 0) // Base condition
    0
  else
    a+Multiplication(a,b-1)        //15+15+15
}