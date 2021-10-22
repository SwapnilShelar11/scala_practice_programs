package oops_practice
abstract class Polygon1(color:String){
  println("Polygon have colour "+color )
  def area:Double
  def peri:Double
}
class Rectangle1(side1:Double,side2:Double,color:String) extends Polygon1(color){
  override def area=side1*side2
  override def peri=2*(side1+side2)
}
object AbstractionPractice {
  def main(args:Array[String]): Unit ={
    val rec = new Rectangle1(10,20,"Red")
    println(s"area of rectangle is ${rec.area} ,perimeter is ${rec.peri}")
  }
}
