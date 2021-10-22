package enum_practice
enum Fruit(wgt:Double):
  case Apple extends Fruit(25.0)
  case Mango extends Fruit(30)
  case Banana extends Fruit(25.0)
object SimpleEnum {
  def main(args:Array[String]): Unit ={
    println(Fruit.Banana.ordinal)
    println(Fruit.Mango)
    println(Fruit.valueOf("Mango"))

  }
}
