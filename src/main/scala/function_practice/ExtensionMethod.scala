package function_practice
case class Circle(radius:Double,x:Int,y:Int)

object ExtensionMethod {
  extension(c:Circle)     //value area is not a member of Circle, but could be made available as an extension method.
    def area:Double={
      c.radius*c.radius/math.Pi
    }
  @main def start ={
    val cir=new Circle(10,2,3)
    println("Area of Circle is "+cir.area)
  }
}
