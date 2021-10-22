package collections
val array:Array[Int]=Array(1,2,3,4,5,6,7,5,2,3,85,2,2)
val string:String="Hello Everyone"

object MoreSequences {
  def main(args:Array[String]): Unit ={
    val mapArray=array.map(_*2)
    for(i<-0 until mapArray.length) print(mapArray(i)+" ")
    println()
    val filterArray=array.filter(_>5)
    for(i<-0 until filterArray.length) print(filterArray(i)+" ")
    println()
    val mapString=string.filter(_.isUpper)
    val filterString=string.map(_.toUpper)
    println(mapString)
    println(filterString)
    println("Head element in string: "+string.head)
    println("Range Seq in scala")
    val to=0 to 5
    val until=0 until(5)
    val toBy=1 to 10 by 3
    println(to)      //0 1 2 3 4 5
    println(until)   //0 1 2 3 4
    println(toBy)   //1 4 7 10
  }
}
