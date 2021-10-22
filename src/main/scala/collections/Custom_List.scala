package Scala_List
case class Employee(name:String,age:Int,salary:Double) extends Ordered[Employee]{
  override def compare(that: Employee): Int = this.age compare(that.age)
}
object Custom_List{
def main(args:Array[String]): Unit ={
  val p1=Employee("Rohit",23,23000.0)
  val p2=Employee("Raghav",11,12000)
  val p3=Employee("Ketan",32,50000)
  val p4=Employee("Pratik",56,100000)
  val p5=Employee("Akash",26,50000)
  val p6=Employee("Shreyash",32,60000)
  val lst=List[Employee](p1,p2,p3,p4,p5,p6)
  val i=lst.iterator
  println("Employee having age greater than 22 & salary greater than 40000:")
  while(i.hasNext){
    val v=i.next()
    if(v.age>22 && v.salary>40000){
      println("Name of Employee is "+v.name+ " , having age is "+v.age+" , having salary is "+v.salary)
    }
  }
  println("_________________________________________________")

  println("Employee having age greater than 22 & less than 30")
  val names=for(p<-lst if(p.age>20 && p.age<30) ) yield "Name of Employee is "+p.name+" , having age is "+p.age+" , having salary is "+p.salary
  for(n<-names) println(n)
  println("_________________________________________________")

  println("Sort list based on age in reverse order:")
  val itr=lst.sorted.reverse.iterator
  while(itr.hasNext){
    var itrNext=itr.next()
    println("Name of Employee is "+itrNext.name+ " , having age is "+itrNext.age+" , having salary is "+itrNext.salary)
  }
  println("_________________________________________________")

  println("Sort list based on name by using sortBy:")
  val itrBy=lst.sortBy(_.name).iterator
  while(itrBy.hasNext){
    var itrByNext=itrBy.next()
    println("Name of Employee is "+itrByNext.name+ " , having age is "+itrByNext.age+" , having salary is "+itrByNext.salary)
  }
  println("_________________________________________________")

  println("Sort list based on Salary if 2 and more emp has same salary then sort by age:")
  val itrSal=lst.sortBy(emp=>(emp.salary,emp.age)).iterator
  while(itrSal.hasNext){
    var itrByNext=itrSal.next()
    println("Name of Employee is "+itrByNext.name+ " , having age is "+itrByNext.age+" , having salary is "+itrByNext.salary)
  }
  println("_________________________________________________")

  val itrWith=lst.sortWith(_.name.length>_.name.length).iterator
  while(itrWith.hasNext){
    var itrByNext=itrWith.next()
    println("Name of Employee is "+itrByNext.name+ " , having age is "+itrByNext.age+" , having salary is "+itrByNext.salary)
  }
}
}
