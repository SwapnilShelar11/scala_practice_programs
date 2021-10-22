package function_practice

class Rational(x:Int,y:Int):
  require(y>0,"Denomenator must be positive..")
  //assert(y>0,"Denomenator must be positive")
  def this(x:Int)=this(x,1)
  def numer=x
  def deno=y
  def mul(r:Rational): Rational={
    Rational(this.numer*r.numer,deno*r.deno)
  }
end Rational

//Data Abstraction
class RationalAbstraction(x:Int,y:Int){
  def gcd(a:Int,b:Int):Int={
  if(b==0) then a else gcd(b,a%b)
  }
  val numer=x/gcd(x,y)
  val deno=y/gcd(x,y)
  def mul(r:RationalAbstraction):RationalAbstraction={
    RationalAbstraction(numer*r.numer,deno*r.deno)
  }
  //Self References - this
  def less(that:RationalAbstraction):Boolean={
    numer*that.numer<deno*that.deno
  }
  def max(that:RationalAbstraction):RationalAbstraction={
    if(this.less(that)) this else that
  }
}
def additionRational(x:Rational,y:Rational): Rational ={
  Rational(x.numer*y.deno+x.deno*y.numer,x.deno*y.deno)
}
object RationalFunction {
  def main(args:Array[String]): Unit ={
    val x=Rational(10,20)
    val y=Rational(20,30)
    val z=Rational(8,7)
    val multi=x.mul(y)
    val add=additionRational(y,z)
    println(s"Multiplication is ${multi.numer}/${multi.deno}")
    println(s"Addition is ${add.numer}/${add.deno}")
    val xa=RationalAbstraction(10,20)
    val ya=RationalAbstraction(20,30)
    val za=RationalAbstraction(25,30)
    val multiAbs=xa.mul(ya)
    println(s"Multiplication is ${multiAbs.numer}/${multiAbs.deno}")
    val maxWithMul=xa.max(ya).mul(za)
    println(s"Max is ${maxWithMul.numer}/${maxWithMul.deno}")
  }
}
