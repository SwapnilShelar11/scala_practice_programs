package Scala_Array

object ArrayExercise {
  // Write a Scala program to find maximum product of two integers in a given array of integers.
  def maximumPair(a:Array[Int]): Unit ={
    var max:Int=a(0)
    var num1:Int=a(0)
    var num2:Int=a(0)
    for(i<-0 to a.length-1){
      for(j<-(i+1)to a.length-1){
        if(a(i)*a(j)>max){
          num1=a(i)
          num2=a(j)
          max=a(i)*a(j)
        }
      }
    }
    println("Two numbers "+num1+" , "+num2+" has maximum product "+max)
  }
  def main(args:Array[String]): Unit ={
    val a=Array[Int](1,2,3,4,5,6,8,7,5,2,4)
    maximumPair(a)


  }
}
