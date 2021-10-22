case class Custom_Scala(name:String,id:Int,number:List[String])
object main{
  def main(args:Array[String]): Unit ={

    val swapnil=Custom_Scala("swapnil",10,List("12356","56789"))
    val rohit=Custom_Scala("rohit",20,List("545","56789"))
    val Shubham=Custom_Scala("Shubham",30,List())
    val ganesh=Custom_Scala("ganesh",40,List("12356"))
    val contact:Array[Custom_Scala]=Array[Custom_Scala](swapnil,rohit,Shubham,ganesh)
    for(i<-contact) {
      println("Name is "+i.name+" ,Id is "+i.id)
      println("Following are Phone numbers")
     for(j<-0 to i.number.length-1){
       println(i.number(j))
     }
    }
  }
}
