package basics_practice

object PatternMatching {
  def search(any: Any):Any= any match{
    case 1=>println("1")
    case "Swapnil"=>println("Swapnil")
    case "Rohit"=>println("Rohit")
    case 2=>println("2")
  }
  def marks(m:Int):String=if(m>10) "Pass" else "Fail"
  def main(args:Array[String]): Unit ={
    val res:Any=search("Swapnil")
    println(marks(7))

  }
}
