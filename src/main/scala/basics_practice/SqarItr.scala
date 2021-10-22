package basics_practice
def isGoodEnough(guess:Double,x:Double):Boolean={
  (guess*guess-x) <0.001
}
def improve(guess:Double,x:Double):Double={
  (guess+x/guess)/2
}
def sqrt(guess:Double,x:Double):Double={
  if isGoodEnough(guess,x) then guess
  else sqrt(improve(guess,x),x)
}
object SqarItr {
  def main(args:Array[String]): Unit ={
    println("bdjhvbhbvhb")
    println(sqrt(4,x))
    println("bdjhvbhbvhb")
  }
}
