package collections

object Scala_Sets {

  def main(args:Array[String]): Unit ={
    val set1=Set[Int](1,2,1,3,4,5,6,7,8,98)
    set1.foreach(x=>println(x))
    val set2=Set[Int](2,5,6,3,7)
    val mergeSet = set1 ++ set2
    println(mergeSet)
    println("Size of merge set is "+mergeSet.size)
    println("Is merge set contains 6 "+mergeSet.contains(6))
   
  }
}
