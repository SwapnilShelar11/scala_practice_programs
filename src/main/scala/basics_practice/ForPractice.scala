package basics_practice

object ForPractice {

  def main(args: Array[String]): Unit = {
    val array = Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i <- array) {
      print(i + " ")
    }
    println()

    //Scala for-loop Example by using to keyword
    for (i <- 0 to array.length - 1) {
      print(array(i) + " ")
    }
    println()

    //Scala for-loop Example by using until keyword
    for (i <- 0 until array.length) {
      print(array(i) + " ")
    }

    println()

    //Scala for-loop filtering Example
    for (i <- 0 until array.length if (array(i) % 2 == 0))
      print(array(i) + " ")
      println()
    var v = for (i <- 0 to 10) yield i*2
    for(i<-v) print(i + ", ")
  }
}

