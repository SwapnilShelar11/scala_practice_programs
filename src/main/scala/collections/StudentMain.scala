package collections

import scala.collection.mutable.ArrayBuffer

case class Student(id: Int, name: String, std: Int, div: Char, percentage: Double) extends Comparable[Student] {
  override def compareTo(that: Student): Int = this.id.compareTo(that.id)
}

object StudentMain {
  def main(args: Array[String]): Unit = {
    val stud1 = Student(70, "Rohit", 10, 'A', 65.0)
    val stud2 = Student(50, "Pratik", 8, 'A', 96.10)
    val stud3 = Student(30, "Rajesh", 10, 'B', 63.0)
    val stud4 = Student(90, "Hardik", 9, 'A', 75.55)
    val stud5 = Student(20, "Pooja", 9, 'B', 48.0)
    val stud6 = Student(60, "Ganesh", 10, 'A', 31.0)
    val stud7 = Student(10, "Salman", 9, 'A', 96.10)
    val stud8 = Student(80, "Arman", 8, 'B', 76.10)
    val stud9 = Student(40, "Rita", 8, 'B', 75.0)
    var newSchool = ArrayBuffer(stud1, stud2, stud3, stud4, stud5, stud6, stud7, stud8, stud9)

    println("Display Student list in sorted as per id...")
    val sortedIdList = newSchool.sorted
    val iterId = sortedIdList.iterator
    while (iterId.hasNext) {
      var s = iterId.next()
      println("Id = " + s.id + ",name = " + s.name + " ,Std = " + s.std + " ,Div = " + s.div + " ,percentage = " + s.percentage)
    }
    println("-----------------------------------")

    println("find Topper in school....")
    val schoolTopperMarks = newSchool.map(_.percentage).max
    newSchool.foreach(x => if (x.percentage == schoolTopperMarks) println("Topper of new School is " + x.name + " ,having percentage =" + x.percentage))
    println("-----------------------------------")

    println("Find Topper of 10 th Standard...")
    val tenStdTopper = newSchool.filter(x => x.std == 10).map(_.percentage).max
    newSchool.filter(x => x.std == 10).foreach(x => if (x.percentage == tenStdTopper) println("Topper of 10th std is " + x.name + " ,having percentage =" + x.percentage))
    println("-----------------------------------")

    println("Find Topper of 9 th Standard...")
    val nineStdTopper = newSchool.filter(x => x.std == 9).map(_.percentage).max
    newSchool.filter(x => x.std == 9).foreach(x => if (x.percentage == nineStdTopper) println("Topper of 9th std is " + x.name + " ,having percentage =" + x.percentage))
    println("-----------------------------------")

    println("Find Topper of 8th Standard div B...")
    val eightBTopper = newSchool.filter(x => x.std == 8 && x.div == 'B').map(_.percentage).max
    newSchool.filter(x => x.std == 8 && x.div == 'B').foreach(x => if (x.percentage == eightBTopper) println("Topper of 8th std Div B is " + x.name + " ,having percentage =" + x.percentage))
    println("-----------------------------------")

    println("Find Students who fail in exam...")
    newSchool.filter(x => x.percentage < 35).foreach(s => println("Id = " + s.id + ",name = " + s.name + " ,Std = " + s.std + " ,Div = " + s.div + " ,percentage = " + s.percentage))
    println("-----------------------------------")

    println("Start preparing new year list...")
    var newSchoolList2 = ArrayBuffer[Student]()
    newSchool.foreach({ y =>
      if (y.percentage >= 35 && (y.std + 1) <= 10)
        newSchoolList2 += Student(y.id, y.name, y.std + 1, y.div, 0.0)
      else if (y.percentage < 35)
        newSchoolList2 += Student(y.id, y.name, y.std, y.div, 0.0)
    })
    println("New year list...")
    println(newSchoolList2)
    println("-----------------------------------")

    println("Group students by std...")
    val group = newSchoolList2.groupBy(x => x.std)
    group.keys.foreach({
      x =>
        print(x + " = ")
        group(x).foreach(y => print(y.name + " ,"))
        println()
    })
  }
}
