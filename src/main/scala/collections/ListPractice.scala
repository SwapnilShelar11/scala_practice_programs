package Scala_List

 object ListPractice{


   def main(args:Array[String]): Unit ={
   val a:List[Int]=List[Int](1,2,3,4,5,6,789)
     //Write a Scala program to delete element(s) from a given List.
     println("drop from 2 "+a.drop(2))
     println("Take upto 2 "+a.take(2))
     println("Multiple of every element "+a.map(x=>x*2))
     println("Filter method "+a.filter(x=>x%2==0))
     println("reduceLeft method "+a.reduceLeft(_+_))
     println("foldLeft Method "+a.foldLeft(100)(_+_))
     println("foldRight Method "+a.foldRight(100)(_+_))
     println("scanLeft Method "+a.scanLeft(10)(_+_))
     val l=List(List(1,2,3,4),List(5,3),List(5,7,90))
     val result = l.flatten
     println(result)
     val b=List[Int](2,3,5,4,6,8,7,2,5,5,63,2,8)
     val z=a zip b
     println(z)
   }
 }
