package basics_practice

//default Constructor
class Bike{
  println("We are in Default Constructor")
}

//primary Constructor
class Car(speed:Double,colour:String){
  println("We are in primary Constructor")
}
//Auxiliary Constructor
class SportBike(speed:Int,colour:String){
  def this(speed:Int)={
    this(speed,"Red")
    println("We are in Auxiliary Constructor")
  }
}
object ConstructorPractice {

  def main(args:Array[String]): Unit ={
    val bike=new Bike()
    val car=new Car(100,"Black")
    val sportBike=new SportBike(100)


  }

}
