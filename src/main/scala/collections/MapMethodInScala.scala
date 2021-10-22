package collections
/*Important points about map() method:

map() is a higher order function.
Every collection object has the map() method.
map() takes some function as a parameter.
map() applies the function to every element of the source collection.
map() returns a new collection of the same type as the source collection.*/


val list=List[Int](1,47,5,7,85,52,3,5,54,52,2,2)
object MapMethodInScala {
  def main(args:Array[String]): Unit ={
    println(list.map((x)=>x*x))
    val listEle=List("Greek","Smart")
    println(listEle.flatMap(_.toLowerCase()))
    val person=List(("Swap","Rahul"),("jhbhjv","hbhjvb"),("vdgcvd"))
    

  }
}
