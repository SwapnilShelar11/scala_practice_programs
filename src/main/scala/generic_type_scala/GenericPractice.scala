package generic_type_scala
class Stack[T]:
  var list:List[T]=Nil
  def push(x:T):Unit={
    list = x :: list
  }
  def peek:T=list.head
  
case class Person(name:String,age:Int,salary:Double)

object GenericPractice {
  def main(args:Array[String]): Unit ={
    val intList = new Stack[Int]
    intList.push(1)
    intList.push(2)
    println(intList.list)
    val stringList=new Stack[String]
    stringList.push("Swapnil")
    stringList.push("Rohit")
    stringList.push("Ganesh")
    println(stringList.list)
    val personList=new Stack[Person]
    personList.push(Person("Ravi",24,25000))
    personList.push(Person("Rushi",32,58000))
    println(personList.peek)
    println(personList.list)
  }
}
