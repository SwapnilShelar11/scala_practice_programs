package type_directed_program
abstract class Animal:
  def name:String

abstract class Pet extends Animal:
  def favFood:String

class Dog(n:String,f:String) extends Pet:
  override def name: String = n
  override def favFood: String = f

class Cat(n:String,f:String) extends Pet:
  override def name: String = n
  override def favFood: String = f

class House[P <: Pet](p:P):
  def pet:P=p

object UpperBounds {
  def main(args:Array[String]): Unit ={
    val dogInRoyHouse=new House[Dog](new Dog("Rock","Biscuit"))
    val catInRoyHouse=new House[Cat](new Cat("Roni","Milk"))
    println(s"Roy has dog name ${dogInRoyHouse.pet.name} and fav. food is ${dogInRoyHouse.pet.favFood}")
    println(s"Roy also has cat name ${catInRoyHouse.pet.name} and fav. food is ${catInRoyHouse.pet.favFood}")
  }
}
