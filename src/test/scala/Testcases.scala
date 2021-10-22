import munit.ScalaCheckSuite
import testing_practice.UnitTesting.{add, multiplication, palindrome, reverseNumber, subtract}
import org.scalacheck.Prop.*
class Testcases extends munit.FunSuite {
  test("add"){
    assertEquals(add(1,2),3)
  }
  test("Subtract"){
    assertEquals(subtract(5,3),2)
    assertEquals(subtract(5,2),3)
  }
  test("multiplication"){
    assertEquals(multiplication(10,2),20)
  }
  test("Pallindome"){
    assertEquals(palindrome("bsbbsdbhd"),false)
    assertEquals(palindrome("abcdsa"),false)
    assertEquals(palindrome("abcscba"),true)
    assertEquals(palindrome("aklka"),true)
  }
  test("Reverse a Number"){
    assertEquals(reverseNumber(1231),1321)
  }
}
