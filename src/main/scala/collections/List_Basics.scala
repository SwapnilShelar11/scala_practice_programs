package Scala_List

object List_Basics {

  def flattenNestedList: Unit ={
    def ls=List(1,2,3,List[Int](4,5,6,8),9)
    println(ls.flatMap(x=>List(x)))
    println(ls)
  }

  def main(args:Array[String]): Unit ={
    val lst=List[Int](1,2,3,4,3,2,1,3)
    println(lst.isEmpty)
    //Write a Scala program to find the nth element of a given list.Write a Scala program to
    // find the nth element of a given list.
    println(lst(lst.length-1))
    //Check list is Palindrome or not
    var flag:Boolean=true;
    for(i<-0 to (lst.length-1)/2){
      if(lst(i)!=lst(lst.length-1-i)){
        flag=false
      }
    }
    if(flag) println("Palindrome")
    else println("Not Palindrome")
flattenNestedList
  }
}
