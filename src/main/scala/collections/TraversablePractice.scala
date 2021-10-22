package collections

object TraversablePractice {
  def main(args:Array[String]): Unit ={
    //It is a trait and used to traverse collection elements. It is a base trait for all scala collections.

    val elem=Traversable(12,4,5,3,7,8,45,3,41,2)
    println("Head element = "+elem.head)
    println("Last element = "+elem.last)
    println("Tail elements = "+elem.tail)
    println("Max element = "+elem.max)
    println("Min element = "+elem.min)
    println("size of elem = "+elem.size)
    println("Last element = "+elem.sum)
    val seqElem=elem.toSeq
    val setElem=elem.toSet
    println("Converted to seq= "+seqElem)
    println("Converted to set= "+setElem)

  }

}
