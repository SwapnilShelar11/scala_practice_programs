package Scala_OOPs.Inheritance

class Triangle(length:Double,height:Double) extends Polygon{
  override def area: Double = 0.5*length*height
}
