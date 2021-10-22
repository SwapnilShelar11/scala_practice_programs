package FileHandelling
import java.io._
import scala.io.Source
val fileObj=new File("ScalaFile.txt")   // Creating a file
val printObj=new PrintWriter(fileObj)

object FileHandllingScala {
  def main(args: Array[String]): Unit = {
    printObj.write("Swapnil Satyawan Shelar")
    printObj.write("\nSwapnil Satyawan Shelar") // Writing to the file
    printObj.close()
    val fileSource=Source.fromFile("ScalaFile.txt")
   /* while (fileSource.hasNext){
      var v=fileSource.next()
      println(v)
    }
*/
    for(line<-fileSource.getLines){
      println(line)
    }
    fileSource.close()
  }
}
