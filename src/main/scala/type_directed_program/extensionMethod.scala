package type_directed_program
case class Rectangle(side1:Double,side2:Double)

extension(r:Rectangle){
  def area:Double=r.side1*r.side2
}
extension(r:Rectangle){
  def peri:Double=2*(r.side1+r.side2)
}
object extensionMethod {
  def main(args:Array[String]): Unit ={
    val r=Rectangle(10,20)
    println("Area of rectangle is "+r.area)
    println("Perimeter of rectangle is "+r.peri)
  }
}
