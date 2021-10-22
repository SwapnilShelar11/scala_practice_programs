package type_directed_program
trait Expr
case class Num(n:Int) extends Expr
case class Add(a:Expr,b:Expr) extends Expr
case class Subtract(a:Expr,b:Expr) extends Expr

  def eval(e:Expr):Int= e match {
    case Num(n)=>n
    case Add(e1,e2)=>eval(e1)+eval(e2)
    case Subtract(e1,e2)=>if(eval(e1)>eval(e2))eval(e1)-eval(e2) else eval(e2)-eval(e1)
    }
object PatternMatching {
  def main(args:Array[String]):Unit={
    println(s"Addition is ${eval(Add(Num(10),Num(20)))}")
    println(s"Subtraction is ${eval(Subtract(Num(25),Num(53)))}")
  }
}
