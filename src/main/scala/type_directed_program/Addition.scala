package type_directed_program

trait SortMain[T]{
  def sort(list: List[T]):List[T]
}
implicit object IntSort extends SortMain[Int]{
  override def sort(list: List[Int]): List[Int] = list.sorted
}
def sort[T](list: List[T])(implicit sortMain: SortMain[T]):List[T]={
  sortMain.sort(list)
}
object Addition {
  def main(args:Array[String]): Unit ={
    println(sort(List(1,5,7,8,5,3,36,58,4)))
  }
}
