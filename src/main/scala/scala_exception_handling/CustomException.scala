package scala_exception_handling
class InvalidAgeException(s:String) extends Exception(s)
def ageChecking(age:Int): Unit ={
  if(age<=18){
    throw InvalidAgeException("you are not allowed")
  }else{
    println("Welcome to Game")
  }
}
object CustomException {
  def main(args:Array[String]): Unit ={
    try{
      ageChecking(18)
    }catch{
      case e:InvalidAgeException=>println(e)
    }
  }

}
