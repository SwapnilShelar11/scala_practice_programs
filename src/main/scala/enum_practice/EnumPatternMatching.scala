package enum_practice
enum Expr:
  case Num(n:Int)
  case Addition(e1:Expr,e2:Expr)
  case Substraction(e1:Expr,e2:Expr)

def eval(e:Expr):Int={
  e match {
    case Expr.Num(n:Int)=>n
    case Expr.Addition(e1:Expr,e2:Expr)=>eval(e1)+eval(e2)
    case Expr.Substraction(e1:Expr,e2:Expr)=>eval(e1)-eval(e2)
  }
}
object EnumPatternMatching {
  def main(args:Array[String]): Unit ={
    println(s"Addition is ${eval(Expr.Addition(Expr.Num(25),Expr.Num(32)))}")
    println(s"Subtraction is ${eval(Expr.Substraction(Expr.Num(25),Expr.Num(32)))}")
  }
}
