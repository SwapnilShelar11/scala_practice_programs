package basics_practice
//package com.practice

/*Imports
Sort import lines alphabetically

Use braces when importing several names from a package
e.g.: import com.twitter.concurrent.{Broker, Offer}

Use wildcards
e.g.: import com.twitter.concurrent._
*/


//UpperCamelCase   =  FirstName
//lowerCamelCase   =  firstName

//Classes/Traits
class Classroom {
  println("We are in Classroom Class")
}

//Methods
def showResult(marks: Double): String = if (marks > 40) "Pass" else "Fail"

// variables
val x = 10 // This variable name reveals nothing
val totalHours = 10 // This variable name reveals total hours

//Constants
val SchoolName = "New English School"

//Singlton Object
object ScalaCodingStandards {
}

//Comments
//Single – line comments.  - //
//Multi – line comments.   -/* ... */
//Documentation comments.   -/* *** */

//Braces
/*
def showResult(marks: Double): Unit = {
  if (marks > 40)
    println("Congrats You are pass")
  if (marks > 90)
    println("A Grade")
  else if (marks > 80)
    println("B Grade")
  else
    println("C Grade")
  else
  println("You Failed")
}*/
def showResult2(marks: Double): Unit = {
  if (marks > 40) {
    println("Congrats You are pass")
    if (marks > 90)
      println("A Grade")
    else if (marks > 80)
      println("B Grade")
    else
      println("C Grade")
  } else
    println("You Failed")
}


//Explicit collections
//import scala.collection.mutable._
import scala.collection.mutable
val mutableLetters = mutable.Seq[String]("Swapnil","Rohit")


//Link - https://twitter.github.io/effectivescala/