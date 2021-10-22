package collections
import scala.collection.mutable
import scala.collection.mutable.*
var map1 = HashMap(("A","Apple"),("A","Address"),("B","Ball"),("C","Cat"),("D","Dog")) //,(null,"null")

 def charFor(s:String):String={
   map1.get(s) match {
     case Some(v)=>v
     case None=>"key not found"
   }
 }

object ScalaMaps {
  def main(args:Array[String]): Unit ={
    println(map1)
    println("Empty Map: "+map1.isEmpty)
    println(map1("A"))
    map1.keys.foreach(x=>println(x+" = "+map1(x)))
    println("Interchange key and values in map: "+map1.map((x,y)=>(y,x)))
    println("Use of Filter in map: "+map1.filter(_._1>"B"))
    println("Use of Filter in map: "+map1.filter((x,y)=>x>"B"))
    //println("H for "+map1("H"))
    println(charFor("H"))
    println(charFor("C"))
    map1.addOne("H","Heart")
  }
}
