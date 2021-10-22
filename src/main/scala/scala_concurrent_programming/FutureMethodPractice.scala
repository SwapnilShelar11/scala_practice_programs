package scala_concurrent_programming
import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global
import scala.util.{Try,Success,Failure}
object FutureMethodPractice {
  val f1=Future{
    "We are in f1 future"
//    throw RuntimeException("Exception")
  }
  def main(args:Array[String]): Unit ={
    f1.onComplete {                        //onComplete Method
      case Success(e)=>println(e)
      case Failure(e)=>println("Fails"+e)
    }
    f1.map(x=>println(x))                  //Map method in future
    Thread.sleep(5000)
  }
}
