package scala_concurrent_programming
import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

val a = Future { Thread.sleep(1000); 42 }
val b = a.map(_ * 2)
object Practice {
  def main(args:Array[String]): Unit ={
    Await.result(a,5.seconds)
    println(b)
  }
}
