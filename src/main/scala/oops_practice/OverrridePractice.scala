package oops_practice
 class Vehical{
  def speed: Unit={
  println("Vehical Speed Method")
  }
}

class Car extends Vehical{
  override def speed: Unit = {
    super.speed
    println("Speed of Car")
  }
}

object OverrridePractice {
  def main(args:Array[String]): Unit ={

  }

}
