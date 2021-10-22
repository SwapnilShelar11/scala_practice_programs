package collections

//FIFO Approch
import scala.collection.mutable
import scala.collection.mutable.*

case class Traveller(name:String,age:Int,destination:String)

object QueueScala {
  def main(args:Array[String]): Unit ={
    var q=Queue[Int](1,2,3,5,6,35,5)
    println("Front of Queue is "+q.front)
    q +=35
    q.enqueue(25)
    q.dequeue
    println("Changed Queue will be = "+q)

    val t1=Traveller("Rajesh",23,"Pune")
    val t2=Traveller("Sumit",32,"Pune")
    val t3=Traveller("Rohit",30,"Pune")
    val t4=Traveller("Prasidh",55,"Pune")
    val t5=Traveller("Kuldeep",45,"Pune")
    val t6=Traveller("Pradip",45,"Pune")
    val t7=Traveller("Rahul",45,"Pune")

    var busToPune=Queue[Traveller]()
    println("Start booking.....")
    busToPune.enqueue(t1)
    busToPune.enqueue(t2)
    busToPune.enqueue(t3)
    busToPune.enqueue(t4)
    busToPune.enqueue(t5)
    busToPune.enqueue(t6)
    busToPune.enqueue(t7)
    println("Booking Office line......")
    println(busToPune)
    println("Only 5 travellers allowed in 1 bus ......")
    for(i<-1 to 5){
      println(busToPune.front.name)
      busToPune.dequeue()
    }
  }
}
