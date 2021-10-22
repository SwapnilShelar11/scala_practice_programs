package scala_concurrent_programming
import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global
def fib( n : Int ) : Int = {
  var a = 0
  var b = 1
  var i = 0

  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  }
  return a
}
object FuturePractice {
  val f=Future{
    println("We are in future")
  }
  val f1=Future{
    for(i<-0 to 30) yield fib(i)
  }
  def main(args:Array[String]): Unit ={
    println("We are before future")
    f1.foreach(println)
    Thread.sleep(5000)
    println("We are after future")
    
  }
}
