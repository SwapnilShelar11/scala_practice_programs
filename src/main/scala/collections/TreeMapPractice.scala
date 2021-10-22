package collections

import scala.collection.immutable.TreeMap
case class Reader(id:Int,name:String,age:Int) extends Ordered[Reader]{
  override def compare(that: Reader): Int = this.id.compareTo(that.id)
}

var map1 = TreeMap(("D","Apple"),("B","Ball"),("A","Cat"),("C","Dog"))

object TreeMapPractice {
  def main(args:Array[String]): Unit ={
    println(map1)

    //Objects of reader
    val ragav=Reader(10,"Ragav",22)
    val pranit1=Reader(30,"Pranit",40)
    val pranit2=Reader(30,"Pranit",40)
    val sumit=Reader(20,"Sumit",30)
    val vaibhavi=Reader(40,"Vaibhavi",42)

    val library=TreeMap(pranit2->List("ABCD","XYZ","ASDF"),vaibhavi->List(),ragav->List("ABCD","QWER"),pranit1->List("HJKL"),sumit->List("XYZ","QWER"))

    println("Sort list according to id....")
    library.foreach(println)

    println("Name of readers who reading 2 or more than 2 books....")
    library.keys.foreach(x=>{
      if(library(x).length>=2) println("Name of Reader is "+x.name)
    })

    println("Name of readers who's age is more than 30....")
    library.keys.foreach(x=>{
      if(x.age>=30) println("Name of Reader is "+x.name)
    })

    println("Books ragav reading currently....")
    println(library.get(pranit1).foreach(x=>println(x)))

    println("sort the Readers according to number of books they reading...")
    val s=library.toList.sortBy(_._2.length)
    println(s)
  }
}
