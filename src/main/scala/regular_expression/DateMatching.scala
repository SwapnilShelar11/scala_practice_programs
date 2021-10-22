package regular_expression
object DateMatching {
  def main(args:Array[String]): Unit ={
    val mentionDate="2004/01/20"
    val date= """(\d\d\d\d)-(\d\d)-(\d\d)""".r
    mentionDate match {
      case date(_*) => "It's a date!"
    }
    println(mentionDate(2004/01/20))
  }
}

