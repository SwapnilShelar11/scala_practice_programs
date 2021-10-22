package Scala_OOPs.Inheritance

class Polygon {
  def area:Double=0.0;
  def printArea(): Unit ={
    println(area)
  }

}
object Polygon{
  def main(args:Array[String]): Unit ={
    val p=new Polygon()
    p.printArea()
    val r=new Rectangle(10,20)
    r.printArea()
    val t=new Triangle(20,30)
    t.printArea()
  }
}
