package scala_exception_handling
import scala.util.{Try,Success,Failure}
def division1(a:Int,b:Int):Try[Int]={
  Try(a/b)
}
object TryPractice {
  def main(args:Array[String]): Unit ={
     division1(10, 2) match{
      case Success(v) => println(s"Division answer is $v")
      case Failure(e) => println(e)
    }
  }
}
