package Scala_String

object String_Practice {
  /* Write a Scala program to exchange the first and last characters in a given string
  and return the new string.*/
  def replaceFirstAndLastChar(s:String): String ={
   s.charAt(s.length-1)+s.substring(1,s.length-1)+s.charAt(0)
  }
  /* Write a Scala program to check if two given strings are rotations of each other*/
  def rotationalStrings(s1:String,s2:String): Unit ={
    if(s1.reverse==s2){
      println("Two given strings are rotations of each other")
    }else println("Two given strings are not rotations of each other")
  }
  /*Write a Scala program to create a new string from a given string swapping
  the last two characters of the given string. The length of the given string must be two or more.*/
  def swappingLastTwoChar(s:String): String ={
      s.substring(0,s.length-2)+s.charAt(s.length-1)+s.charAt(s.length-2)
  }
  /*Write a Scala program to read two strings append them together and return the result. If the length
  of the strings is different remove characters from the beginning of longer string and make them equal length.*/
  def appendStrings(s1:String,s2:String): String ={
    if(s1.length==s2.length){
      s1+s2
    }else if(s1.length>s2.length){
      s1.drop(s1.length-s2.length)+s2
    }else{
      s1+s2.drop(s2.length-s1.length)
    }
  }
  /*Write a Scala program to check whether the first two characters present at the end of a given string.*/

  def firstLastTwoCharSame(s:String): Unit ={
    if(s.length>=2){
    if(s.substring(0,1)==s.substring(s.length-2,s.length-1)){
      println("first two characters present at the end of a given string")
    }else{
      println("first two characters are not present at the end of a given string")
    }
    }else{
      println("Invalid String")
    }
  }
def main(args:Array[String]): Unit ={
println(replaceFirstAndLastChar("Swapnil"))
  rotationalStrings("swap","pawsd")
  println(swappingLastTwoChar("Swapnil"))
  println(appendStrings("abcd","bcdffrt"))
  firstLastTwoCharSame("asbjhbdhdbvvdba")
  firstLastTwoCharSame("ba")
  firstLastTwoCharSame("a")
}
}
