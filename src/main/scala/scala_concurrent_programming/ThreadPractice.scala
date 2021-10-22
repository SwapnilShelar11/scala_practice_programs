package scala_concurrent_programming
class Numbers extends  Thread{
  override def run(): Unit = {
    for(i<- 0 to 10){
      println(this.getName+" = "+i)
    }
  }
}
object ThreadPractice {
  def main(args:Array[String]): Unit ={
    val t1=new Numbers
    val t2=new Numbers
    t1.start()
    t1.join()  //join() method waits for a thread to die.
    t2.start()
  }
}
