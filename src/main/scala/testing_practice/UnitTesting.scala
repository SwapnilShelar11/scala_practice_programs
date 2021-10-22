package testing_practice

import scala.util.control.Breaks.{break, breakable}

object UnitTesting {
  def add(a: Int, b: Int): Int = {
    a + b
  }

  def subtract(n1: Int, n2: Int): Int = {
    n1 - n2
  }

  def multiplication(n1: Int, n2: Int): Int = {
    n1 * n2
  }

  def palindrome(s: String): Boolean = {
    var flag: Boolean = true
    breakable {
      for (i <- 0 to s.length / 2) {
        if (s.charAt(i) != s.charAt(s.length - 1 - i)) {
          flag = false
          break
        }
      }
    }
    flag
  }

  def reverseNumber(n: Int): Int = {
    var num: Int = n
    var rem: Int = num
    var rev: Int = 0
    while (num > 0) {
      rem = num % 10
      num = num / 10
      rev = rev * 10 + rem
    }
    rev
  }

  def main(args: Array[String]): Unit = {
    println(reverseNumber(123))
    println(add(1, 2))
    println(subtract(5, 4))
    println(multiplication(5, 6))
    println(palindrome("hbndvbb"))
    println(reverseNumber(123))


  }
}
