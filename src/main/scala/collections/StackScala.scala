package collections
import scala.collection.mutable.Stack
//LILO Approch

val callLogs=Stack[String]("765465465464","6515145641","2312313120","15465464465")
val parking=Stack[String]("Ganesh","Ragav","Sumeet","Satish")

object StackScala {
  def main(args:Array[String]):Unit={
    println("Call new number "+callLogs.push("857445552"))
    println("Take number which i called last "+ callLogs.top)
    println("Delete number which is on top "+callLogs.pop)
    println("New Call log is "+callLogs)
    
    println("Car Parking..............")
    println("Remove last car in parking = "+parking.pop)
    println("Add Car in parking = "+parking.push("Rajesh"))
    println("Check whether parking is empty ="+ parking.isEmpty)
    parking.foreach(println)
  }
}
