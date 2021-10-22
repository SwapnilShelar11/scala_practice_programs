package regular_expression
import java.util.Scanner
val sc=new Scanner(System.in)
object GmailValidation {
  def main(args:Array[String]): Unit ={
    println("Enter your Email Id")
    val email=sc.nextLine()
    val emailRegEx=""""^(.+)@(.+)$""""
    if(email.matches(emailRegEx)) println("True") else println("Fail")
  }
}
