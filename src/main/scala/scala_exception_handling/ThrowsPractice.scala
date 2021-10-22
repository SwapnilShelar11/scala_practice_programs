package scala_exception_handling
def division2(a:Int,b:Int): Double ={
  throws(classOf[NumberFormatException])
  println("Program may throw exception")
  return a/b
}
object ThrowsPractice {
  def main(args:Array[String]): Unit ={
    try{
      println(division2(10,2))
        println(division2(10,0))
    }catch{
      case e:ArithmeticException=>println("Arithmatic Exception "+e)
    }
  }
}
