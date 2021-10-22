package function_practice
def add(n:Int):Int={
  if(n>0){
    if(n==1) 1
    else n+(n-1)
  }else{
    println("pls enter positive number")
    n
  }

}
object RecursionExample {
  def main(args:Array[String]): Unit ={
    println(add(0))
  }
}
