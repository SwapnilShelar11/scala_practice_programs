package scala_exception_handling
def admission(marks:Int): Unit ={
  if(marks<65){
    throw new ArithmeticException("You are not illigible Candidate")
  }else{
    println("you are elligible Candidate")
  }
}
object ThrowPractice {
  def main(args:Array[String]): Unit ={
    try{
      admission(55)
    }catch{
      case e:ArithmeticException=>println(e)
    }
  }
}
