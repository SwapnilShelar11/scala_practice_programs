package oops_practice

object Addition {
  def add(): Unit ={
    println("We are in default method")
  }
  def add(a:Int,b:Int): Unit ={
    println("We have parametrized Constructor")
    println("Addition is "+(a+b))
  }
  def add(a:Int,b:Int,c:Int): Unit ={
    println("We have parametrized Constructor")
    println("Addition is "+(a+b+c))
  }
  def main(args:Array[String]): Unit ={
    add()
    add(1,2)
    add(1,2,3)
  }
}
