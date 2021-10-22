package function_practice
val list=List[Int](1,47,5,7,85,52,3,5,54,52,2,2)
lazy val output=list.map((x)=>x*2)      //The value isn’t calculated till we use output2 that’s till println(output).
object LazyComputationScala {
  def main(args:Array[String]): Unit ={
    println(output)
  }
}
