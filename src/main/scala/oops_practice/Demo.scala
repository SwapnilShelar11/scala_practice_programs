package Scala_OOPs
class User(var name:String,var age:Option[Int]){
  def this()={
    this("Tom",Some(16))
  }
  def this(name:String)={
    this(name,Some(16))
  }
}
object Demo {
def main(args:Array[String]): Unit ={
  val u1=new User("Swapnil")
  val u2=new User()
  val u3=new User("Rohit")
  println("Name is "+u1.name+" having age "+u1.age)
  println("Name is "+u2.name+" having age "+u2.age)
  println("Name is "+u3.name+" having age "+u3.age)
}
}
