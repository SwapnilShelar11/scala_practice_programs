package function_practice

class Addition(x:Int,y:Int){
  def this(i:Int)={
    this(i,1)
  }
  println("Addition is "+(x+y))
}

 object SelfReferances {
   def main(args:Array[String]): Unit ={
     val a1=Addition(10,20)
     val a2=Addition(10)
   }

}
