package type_directed_program
import type_directed_program.Person.ordering

import java.util.Comparator

case class Person(age:Int) extends Comparable[Person]{
  override def compareTo(that: Person): Int = this.age.compareTo(that.age)
}
case class Manager(age:Int,name:String) extends Ordered[Manager]{
  override def compare(that: Manager): Int = this.age compare(that.age)
}
object Person{
  //1st way of ordering
 /*  val ordering:Ordering[Person]=new Ordering[Person]{
    override def compare(x: Person, y: Person): Int = x.age.compare(y.age)
 }*/
 //2nd way of orderring
 // implicit val ordering:Ordering[Person]=(t1,t2)=>t1.age.compare(t2.age)

 //3 rd way of ordering
implicit val ordering:Ordering[Person]= _.age compare _.age

 //4th way of ordering
 //implicit val ordering:Ordering[Person]=Ordering.by(_.age)
  val reverse:Ordering[Person]=ordering.reverse
}

object PersonMain{
  var list=List[Manager](Manager(15,"ddjhd"),Manager(25,"hjbfbvgbb"),Manager(20,"bdfhbhb"))
  var listPer=List[Person](Person(15),Person(25),Person(20))
  def main(args:Array[String]): Unit ={
    println(list)
    println(list.sorted)
    println(list.sortBy(_.name))
    println(list.sortBy(_.name).reverse)
   // println(list.sortBy(_.name)(Ordering[String]).reverse)
    println("-"*80)
    println(listPer)
    println(listPer.sorted)
    println(listPer.sorted(Person.ordering))
    println(listPer.sorted(Person.reverse))
  }
}
