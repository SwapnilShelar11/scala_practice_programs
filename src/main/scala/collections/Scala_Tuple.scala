package Scala_List

object Scala_Tuple {
  def main(args:Array[String])={
    val myTuple=new Tuple5(1,2,"Hello",true,(1,2))
    println(myTuple)
    println(myTuple._3)
    println(myTuple._1)
    myTuple.productIterator.foreach {
      i =>
        println(i)
        println(1 -> "Swapnil" -> "Raj")
        println(myTuple._5)
    }
  }
}
