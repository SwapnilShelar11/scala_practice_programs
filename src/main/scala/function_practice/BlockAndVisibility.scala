package function_practice
def square(x:Int,y:Int): Int ={     //Definitions of outer blocks are visible inside a block unless they are shadowed.
  def add(v:Int,z:Int): Int ={
    v+z
  }
  add(x*x,y*y)
}
object BlockAndVisibility {
  def main(args:Array[String]): Unit ={
    println("Add square of 2 nos. ="+square(10,20))
    //add(10,20)        //add will not visible outside block
  }
}
