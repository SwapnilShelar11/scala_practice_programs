package oops_practice
class A{
  println("We are in A")
}
class B extends A{
  println("We are in B")
}
class C extends A {
  println("We are in c")

}
class D extends  C{
  println("We are in D")
}
object InheritancePractice {
  def main(args:Array[String]): Unit ={
    println("Simple Inheritance...")
    val b=new B
    println("Multilevel Inheritance...")
    val d= new D
    println("Multiple Inheritance...")
    val c=new C
    val b1=new B
  }

}
