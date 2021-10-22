package Scala_Array

object ArrayPracice {
  //Sort Array in Scala
  def sortArray(a:Array[Int]): Array[Int] ={
    for(i<-0 to a.length-1){
      for(j<-(i+1) to a.length-1){
        if(a(i)>a(j)){
          var temp=a(i)
          a(i)=a(j)
          a(j)=temp
        }
      }
    }
    return a;
  }
  //Write a Scala program to find the number of even and odd integers in a given array of integers
  def countEvenOdd(a:Array[Int]): Unit ={
    var evenCount:Int=0;
    var oddCount:Int=0;
    for(i<-a){
      if(i%2==0){
        evenCount+=1
      }else{
        oddCount+=1
      }
    }
    println("Number of even numbers "+evenCount)
    println("Number of odd numbers "+oddCount)
  }
  /*Write a Scala program to separate even and odd numbers of a given array of integers.
   Put all even numbers first, and then odd numbers.*/
  def evenFirstOddLast(a:Array[Int]): Array[Int] ={
    val v:Array[Int]=new Array[Int](a.length)
    var k:Int=0;
    for(i<-a){
      if(i%2==0){
        v(k)=i
        k+=1
      }
    }
    for(i<-a){
      if(i%2!=0){
        v(k)=i
        k+=1
      }
    }
return v
  }
def main(args:Array[String]): Unit ={
val a:Array[Int]= new Array[Int](4);
  a(0)=20;
  a(1)=50;
  a(2)=31;
  a(3)=40;
  val b:Array[Int]=sortArray(a)
  println("Sorted Array:")
  for(i<-b){
    print(i+" ")
  }
  println()
  //Write a Scala program to find the second smallest element from a given array of integers.
  println("Secound Smallest number is "+b(1))
  countEvenOdd(a)
  println("Even first Odd Last...")
  val c:Array[Int]=evenFirstOddLast(a)
  for(i<-c){
    print(i+" ")
  }
}
}
