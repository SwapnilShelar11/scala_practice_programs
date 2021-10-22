package FileHandelling
import java.io
import scala.io.Source
object StudentRecords {
  def main(args:Array[String]): Unit ={
    val studentFile=Source.fromFile("C:\\Users\\Swapnil Shelar\\IdeaProjects\\Practice_Project\\src\\main\\scala\\FileHandelling\\student.json")
    val studentData=studentFile.getLines
    for (i<-studentData) println(i)
  }
}
