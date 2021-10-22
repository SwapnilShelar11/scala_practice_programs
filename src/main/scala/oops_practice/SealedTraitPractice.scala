package oops_practice

sealed trait School:
  def standards:Unit

class NewEnglishSchool extends School:
  override def standards: Unit = println("1 st to 10th Standrds Available")
object SealedTraitPractice {

}
