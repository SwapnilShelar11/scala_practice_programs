package basics_practice
case class Rectangle(width: Int, height: Int):
  def area: Int = width * height
object RulesOfBoolean {
  def main(args:Array[String]): Unit ={
    val l= List.empty[Int]

    val fourByFive = Rectangle(4, 5)
    val sixByFive  = fourByFive.copy(width = 6)
    println(Rectangle(width = 4, height = 5).area)
  }
}
