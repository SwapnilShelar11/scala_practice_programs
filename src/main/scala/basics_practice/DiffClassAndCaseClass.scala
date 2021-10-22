package basics_practice
class Account(no:Int,name:String)
case class AccountHolder(no:Int,name:String)
object DiffClassAndCaseClass {
  def main(args:Array[String]): Unit ={
    val a1=new Account(10,"Swapnil")
    val a2=new Account(10,"Swapnil")
    println(a1==a2)
    val h1=AccountHolder(10,"Swapnil")   //not needed to write new keyword
    val h2=AccountHolder(10,"Swapnil")
    println(h1==h2)
  }
}
