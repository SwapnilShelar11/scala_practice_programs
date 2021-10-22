package collections
import scala.collection.mutable._
object ScalaMutablePractice {
  def main(args:Array[String]): Unit ={
    val ab=ArrayBuffer[Int](1,2,345,65)
    ab.insert(4,12)
    println(ab)
    println(ab.remove(3))
    println(ab)
  }
}
