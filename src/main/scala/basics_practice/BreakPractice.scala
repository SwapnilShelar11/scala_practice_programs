package basics_practice
import scala.util.control.Breaks._

object BreakPractice {
  def main(args:Array[String]): Unit ={
    breakable{
      for(i<-0 to 10){
        if(i==7){
          break
        }
        print(i+" ")
      }
    }
    println()
    for(i<-0 to 10){
      breakable{
        if(i==7){
          break  //break out of the breakable and outside loop will continued
        }
        print(i+" ")
      }
    }
  }
}
