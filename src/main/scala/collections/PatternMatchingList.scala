package collections

val listInt=List[Int](1,2,3,1,4,5,5,6,6,9)
val fruit=List[String]("swapnil","rohit","anand","ganesh")

def reverseList(list:List[Int]):List[Int]={
  list match {
    case head :: tail=>reverseList(tail):+head
    case Nil=>List[Int]()
  }
}
def pickEven(list:List[Int]):List[Int]={
  list match {
    case Nil=>List[Int]()
    case List(_)=>List[Int]()     //list has only one element
    case head1::head2::tail=>head2::pickEven(tail)
  }
}

object PatternMatchingList {
  def main(args:Array[String]): Unit ={
    var evenList:List[Int]=Nil
    println("Reverse list is "+reverseList(listInt))
    for(i<-0 until listInt.size) if(i%2!=0){
      evenList=evenList:+listInt(i)
    }
    println("Even list by for loop"+evenList)
    println("Pick even list = "+pickEven(listInt))
    println("Last element of lis is "+last(listInt))

  }
}
 def last(xs:List[Int]):Int=xs match {
   case List()=>throw Exception("List is empty")
   case List(x)=>x
   case y::ys=>last(ys)
 }