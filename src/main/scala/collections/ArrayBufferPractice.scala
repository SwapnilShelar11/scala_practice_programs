package collections

import scala.collection.mutable.ArrayBuffer

object ArrayBufferPractice {
  def main(args:Array[String]): Unit ={
    val ab=ArrayBuffer[String]()
    ab+="Swapnil"
    ab+="John"
    ab+="Rita"
    ab+="Pushkar"
    val iter=ab.iterator
    while(iter.hasNext){
      var i=iter.next()
      println(i)
    }
    ab.append("Ganesh","Sumit")
    println(ab)
    ab-="Sumit"
    ab.remove(2)
    println(ab)
  }
}
