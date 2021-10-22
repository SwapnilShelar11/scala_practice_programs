package basics_practice.scala_string

object StringPractice {
  def main(args: Array[String]): Unit = {
    val s1: String = "Hello"
    val s2 = new String("Hello World Swapnil")
    val s3 = new String("Hello")
    println(s1.equals(s2))
    println(s1 == s2)
    println(s2 == s3)
    val v = 2.522222
    println(s"To everyone $s2")
    println(f"To everyone $s2%s having value $v%2.3f")
  }
}
