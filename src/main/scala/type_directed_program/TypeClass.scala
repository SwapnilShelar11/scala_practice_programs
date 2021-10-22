
package type_directed_program
object TypeClass {
trait Summable[T]{
  def sum(list:List[T]):T
}
  implicit object IntSummable extends Summable[Int]{
  override def sum(list: List[Int]): Int = list.sum
}
  implicit object StringSummable extends Summable[String]{
  override def sum(list: List[String]): String = list.mkString("")
}
  def processList[T](list: List[T])(implicit summable: Summable[T]): T ={  //ad-hoc polymorphism
    summable.sum(list)
  }
  def main(args:Array[String]): Unit ={
    val v=processList(List(12,35,45,7,8,2,85,63))
    val s=processList(List("dbf","jnffbn","jnbvbbf"))
    println(v)
    println(s)
    // val b=processList(List(true,false,true))    //It will genrate compile time error
  }
}
