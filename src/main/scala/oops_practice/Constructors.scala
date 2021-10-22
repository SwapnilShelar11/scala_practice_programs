package oops_practice

class Person(name: String, age: Int, healthStatus: String, mobileNumber: String) {
  def this(name: String, age: Int, healthStatus: String) = {
    this(name, age, healthStatus, "NA")
  }

  override def toString: String = "Name of Person is " + this.name + " having age " + this.age + " \nhealth Status is " + this.healthStatus + " Mobile number=" + this.mobileNumber
}

object Constructors {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Rajendra", 32, "Good", "9875321500")
    val p2 = new Person("Kushal", 25, "Bad", "986545555")
    val p3 = new Person("Rohit", 21, "VeryGood")
    val p4 = new Person("Ganesh", 31, "Good")
    println(p1.toString)
    println("____________________________")
    println(p2.toString)
    println("____________________________")
    println(p3.toString)
    println("____________________________")
    println(p4.toString)
    println("____________________________")
  }
}
