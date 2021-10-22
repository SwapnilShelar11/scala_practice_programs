package FileHandelling

import java.io.*
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

def individualPhoneNumber(s:Array[Array[String]],name:String):Unit={
  val pn = s.filter(x => x(1) == name)
  pn.foreach(x => println("Name of employee is " + x(1) + " havine phone no. is " + x(4)))
}
def phoneNumber(s:  Array[Array[String]]):Unit={
  s.take(5).foreach(x => println("Name of employee is " + x(1) + " havine phone no. is " + x(4)))
}
def groupByJobTitle(s:Array[Array[String]]):Unit={
  val group=s.groupMap(_(6))(_(1))
  group.keys.foreach({
    x=>print(x+" = ")
      group(x).foreach(y=>print(y+" ,"))
      println()
  })
}
def greaterSalaryEmployee(s:Array[Array[String]],salary:Double): Unit ={
  s.filter(x=>x(7).toDouble>salary).foreach(y=>println(y(1)+" having salary "+y(7)))
}
object HandllingCSV {
  def main(args: Array[String]): Unit = {
    val fileSource = Source.fromFile("C:\\Users\\Swapnil Shelar\\IdeaProjects\\Practice_Project\\src\\main\\scala\\FileHandelling\\employees.csv")
    val employeeData= fileSource.getLines().drop(1).map(_.split(",")).toArray
    println("Retrive Phone number of Donald...")
    individualPhoneNumber(employeeData,"Donald")
    println("----------------------------------------------")

    println("Retrive phone numbers of Top 5 employees...")
    phoneNumber(employeeData)
    println("----------------------------------------------")

    println("Name of employees from each job title...")
    groupByJobTitle(employeeData)
    println("----------------------------------------------")

    println("Select employees whoose salaries greater than 30000")
    greaterSalaryEmployee(employeeData,10000)
    println("----------------------------------------------")

    employeeData.foreach(x => println(x(0)+" ,"+x(1)+" ,"+x(2)+" ,"+x(3)+" ,"+x(4)+" ,"+x(5)+" ,"+x(6)+" ,"+x(7)))
    println("----------------------------------------------")
  }
}
