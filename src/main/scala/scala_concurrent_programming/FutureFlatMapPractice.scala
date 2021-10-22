package scala_concurrent_programming

import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global

def biscuitQuantity: Future[Int] = Future {
  println("We are in future of biscuit quantity")
  10
}

def biscuitPrice(qty: Int): Future[Boolean] = Future {
  println(s"We are in future of biscuit quantity $qty")
  true
}

object FutureFlatMapPractice {
  def main(args: Array[String]): Unit = {
    val flatMap1: Future[Boolean] = biscuitQuantity.flatMap(qty => biscuitPrice(10))
    import scala.concurrent.Await
    import scala.concurrent.duration._
    val isSuccess = Await.result(flatMap1, 5.seconds)
    println(isSuccess)

    // Chaining Futures using for comprehension
    for {
      qty <- biscuitQuantity
      isSuccess1 <- biscuitPrice(10)
    }
      println(isSuccess1)
      println(qty)
    Thread.sleep(5585)
  }
}
