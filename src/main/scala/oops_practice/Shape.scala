package oops_practice

trait Shape {
  def area:Double
  def colour:String
  def shapeName:String
}
class Rectangle(length: Double,breadth:Double) extends Shape{
   def area: Double =length*breadth
  def colour: String="Red"
  def shapeName:String="Rectangle"
}
class Circle(radius:Double) extends Shape{
  def area: Double =3.14*radius*radius
  def colour: String="Black"
  def shapeName:String="Circle"
}

class Triangle(height:Double,width:Double){
  def area: Double =0.5*height*width
  def colour: String="Orange"
  def shapeName:String="Triangle"
}
object Main{
  def main(args:Array[String]): Unit ={
    val rec=new Rectangle(10,20)
    val cir=new Circle(10)
    val tri=new Triangle(25,26)
    println("Area of "+rec.shapeName+" is "+rec.area+" having colour is "+rec.colour)
    println("Area of "+tri.shapeName+" is "+tri.area+" having colour is "+tri.colour)
    println("Area of "+cir.shapeName+" is "+cir.area+" having colour is "+cir.colour)
  }
}