/*Write a Scala program to check which number is nearest to the value 100 among two given integers.
  Return 0 if the two numbers are equal.
  */
object NumberNearest {
  def numberNear(num:Int,num1:Int,num2:Int): Int ={
   val diff1=num1-num
    val diff2=num1-num
    if(num1==num2) return 0
    else if(diff1>diff2) return num1
    else return num2
  }
  /* Write a Scala program to check whether a given positive number is a multiple of 3 &
  a multiple of 7*/
  def multipleOfBoth(num:Int): Unit ={
    if(num%3==0&&num%7==0){
      println("Number "+num+" is multiple of both 3 & 7")
    }
  }
  /*Write a Scala program to convert the last 4 characters of a given string in upper case.
  If the length of the string has less than 4 then uppercase all the characters */
def lastFourCharUpperCase(s:String): String ={
  s.take(s.length()-4)+s.drop(s.length()-4).toUpperCase()
}
//Write a Scala program to check whether two given positive integers have the same last digit.
  def sameLastDigit(num1:Int,num2:Int):Unit ={
    val rem1=num1%10
    val rem2=num2%10
    if(rem1==rem2) println("Same Last digit")
    else println("Diff last digit")
  }


def main(args:Array[String]): Unit ={
val num1=numberNear(100,95,90)
  val num2=numberNear(100,95,110)
  println("Nearest number is "+num1)
  println("Nearest number is "+num2)
 println(lastFourCharUpperCase("nil"))
  sameLastDigit(1220,2360)
  multipleOfBoth(20)
}
}
