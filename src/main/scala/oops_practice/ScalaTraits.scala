package oops_practice
trait Bike{
  def run():Unit
}
trait Engine{
  def efficiency():Unit
}

abstract class MusicSystem{
  def play():Unit
}

class Hero extends Bike{
  def run():Unit={
  println("Hero bike run method")
  }
}

// Implementing Multiple Traits in a Class

class Splender extends Bike with Engine{
  def run():Unit={
    println("Splender bike run method")
  }
  def efficiency():Unit={
    println("Splender bike Engine")
  }
}

//Scala Trait Mixins

class Swift extends MusicSystem with Engine {
  def efficiency():Unit={
    println("Car Engine")
  }
  def play():Unit={
    println("{lay music")
  }  
}
object ScalaTraits {
  def main(args:Array[String]): Unit ={

  }
}

 /*class KBPSchool extends School:
   override def standards: Unit = println("Upto 7th Available")*/