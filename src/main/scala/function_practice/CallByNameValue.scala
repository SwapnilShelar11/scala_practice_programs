package function_practice
def pricesEveryDay(i: Int): Unit ={
  println("1st day Price is "+i)
  println("2st day Price is "+i)
  println("3st day Price is "+i)
  println("4st day Price is "+i)
  println("5st day Price is "+i)
}
object CallByNameValue {
  def main(ars:Array[String]): Unit ={
    var rs=10;
    pricesEveryDay{
      rs+=1
      rs
    }
  }

}
