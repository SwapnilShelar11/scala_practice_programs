package collections
case class Employee(name:String,age:Int,salary:Double,dept:String)
val e1=Employee("Rohit",23,23000.0,"Production")
val e2=Employee("Raghav",11,12000,"QA")
val e3=Employee("Ketan",32,50000,"Account")
val e4=Employee("Pratik",56,100000,"Production")
val e5=Employee("Akash",26,50000,"HR")
val e6=Employee("Shreyash",32,60000,"QA")
val empList=List(e1,e2,e3,e4,e5,e6)

object EmployeeMap {
  def main(args:Array[String]): Unit ={
    val sortByDept=empList.groupBy(_.dept)
    val sortToMap=empList.groupMap(_.dept)(_.name)

    println("use of groupBy..................")
    sortByDept.keys.foreach(x=>println(x+" = "+sortByDept(x)))

    println("Use of groupMap..................")
    println(sortToMap)
    val avgAge=empList.groupMap(_.dept)(_.age)
    avgAge.keys.foreach(x=>println("Avg age of "+x+" = "+(avgAge(x).sum)/(avgAge(x).length)))
  }
}
