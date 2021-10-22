package type_directed_program
trait Expression:
  def eval:Int
class Number(num:Int) extends Expression:
  override def eval: Int = num

class Sum(a:Expression,b:Expression) extends Expression:
  override def eval: Int = a.eval+b.eval

class Sub(a:Expression,b:Expression) extends Expression:
  override def eval: Int = if(a.eval>=b.eval) a.eval-b.eval else b.eval-a.eval

//If we want to display express, we need to add display in all sub types

object DecompositionPractice {
  def main(args:Array[String]): Unit ={
    val s=new Sum(new Number(10),new Number(20))
    val sub=new Sub(new Number(10),new Number(20))
    println(s"Sum is ${s.eval}")
    println(s"Subtraction is  is ${sub.eval}")
  }
}
