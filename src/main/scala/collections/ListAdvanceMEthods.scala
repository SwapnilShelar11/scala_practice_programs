package collections
val listInt=List[Int](1,1,2,3,4,5,5,6,7,7,7,8,6,9,9)

def pack[T](xs:List[T]):List[List[T]]={
  xs match {
    case Nil=>Nil
    case x::xa=>
      val (more,rest)=xa.span(y=>y==x)
      (x::more)::pack(rest)
  }
}

object ListAdvanceMethods {
  def main(args:Array[String]): Unit ={
    println("Filter mathod "+listInt.filter(x=>x%2==0))
    println("filter not method "+listInt.filterNot(x=>x%2==0))
    println("Partition method "+listInt.partition(x=>x%2==0))
    println("Take while method "+listInt.takeWhile(x=>x<4))
    val s=listInt.span(_<6)
    println("Span method "+s)
    println(pack(listInt))

  }
}
