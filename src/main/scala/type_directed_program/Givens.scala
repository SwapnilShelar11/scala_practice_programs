package type_directed_program
case class Person1(name:String,age:Int)
implicit val ordering:Ordering[Person1]= _.age compare _.age

given orderPerson:Ordering[Person1] with
  override def compare(x: Person1, y: Person1): Int = x.age.compare(y.age)

def max[T](x: T, y: T)(using ord: Ordering[T]): T =
  if ord.compare(x, y) < 0 then y else x

object Givens {
  val list=List[Person1](Person1("Swapnil",12),Person1("Rohit",25),Person1("Shubham",18))
  def main(args:Array[String]): Unit ={
    println(list)
    println(list.sorted(ordering))
    println(list.sorted(orderPerson))
    println(max(Person1("Swapnil",12),Person1("Rohit",25))(using orderPerson))
  }
}
