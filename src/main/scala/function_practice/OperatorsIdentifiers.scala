package function_practice
class RationalNumbers(x:Int,y:Int):
  def gcd(a:Int,b:Int):Int={
    if(b==0) then a else gcd(b,a%b)
  }
  val numer=x/gcd(x,y)
  val deno=y/gcd(x,y)
  def *(r:RationalNumbers): RationalNumbers={
    RationalNumbers(numer*r.numer,deno*r.deno)
  }
  def /(r:RationalNumbers):RationalNumbers={
    RationalNumbers(this.numer*r.deno,this.deno*r.numer)
  }
  infix def mul(r:RationalNumbers): RationalNumbers={
    RationalNumbers(numer*r.numer,deno*r.deno)
  }

object OperatorsIdentifiers {
  def main(args:Array[String]): Unit ={
    val x=RationalNumbers(10,20)
    val y=RationalNumbers(20,30)
    val z=RationalNumbers(15,21)
    val multi=x*y                          //Relaxed Identifiers
    val multiInfix=x mul y                 //Infix notation
    val answer=x mul y / z
    println(s"Multiplication is ${multi.numer}/${multi.deno}")
    println(s"Multiplication is ${multiInfix.numer}/${multiInfix.deno}")
    println(s"Answer is ${answer.numer}/${answer.deno}")
  }
}
