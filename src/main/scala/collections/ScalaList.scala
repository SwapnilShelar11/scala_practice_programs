package collections
import scala.util.control.Breaks._
object ScalaList{
  def main(args:Array[String]): Unit ={
    var v=List[Int](1,5,8,9,6,5,4,5,3)
    var v1=List[Int](1,5,8,5,3)
    v.foreach(x=>println(x))
    println(v.reverse)
    println(v.lastIndexOf(5))
    println(v.endsWith(List(5,3)))
    println(v(2))
    var v3:List[Int]=v++v1
    println(v.sorted)
    v.foreach(println)
    val l=List[String]("nnjkvnv","jhvbhfbv")
    println(l.flatMap(_.toLowerCase))
    val list=List(1,2,3,2,1,0)
    var flag=false
    breakable {
      for (i <- 0 to list.length / 2) if (list(i) != list(list.length - i - 1)) flag = true;
      break
    }
    if(flag) println("Not Palindrome") else println("Palindrome")
  }
}
