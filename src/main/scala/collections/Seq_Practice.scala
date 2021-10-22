package collections
import scala.collection.mutable

object Seq_Practice {
  def main(args:Array[String]): Unit ={
   var seq:Seq[Int]=Seq[Int](1,2,3,4,5,7,58,25)
    println("Element at 1st index is "+seq(1))
    seq.foreach(x=>print(x+" "))
    println()
    var a:Array[Int]=new Array[Int](5)
    seq.copyToArray(a,0,5)
    a.foreach(x=>print(x+" "))
    println()
    println("is seq ends with 58,25 "+seq.endsWith(Seq(58,25)))
    println("is seq is empty "+seq.isEmpty)
    println("Last index of 58 is "+seq.lastIndexOf(58))
    seq.reverse.foreach(x=>print(x+" "))
    println()
   val l1=mutable.Seq(1,2,3,12,3)
   val l2=List(1,2,5,6,3,65).toSeq
   println(l1(2))
   println(l2(2))
   val b=mutable.ArrayBuffer(1,2,5,5,4,4,5,1)
  } 
}
