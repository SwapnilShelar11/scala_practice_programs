package scala_concurrent_programming
import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.duration._
import concurrent.ExecutionContext.Implicits.global
val fut=Future{
  println("We are in future")
}
object FutureAwaitPractice {
  def main(args:Array[String]): Unit ={
    println("Before future")
    Await.ready(fut,1.minute)              //object for blocking the current thread until a Future completes
    Await.result(fut,1.minute)
    println("After future")
  }
}
