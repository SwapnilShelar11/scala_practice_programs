package scala_concurrent_programming
class Example extends Thread{
  override def run={
    Thread.sleep(2000)
    println("Run method is running in thread class...")

  }
}
class RunnableExample extends Runnable{
  override def run(): Unit = {
    println("Run method is running in runnable...")
  }
}
object ThreadClass {
  def main(args:Array[String]): Unit ={
    val obj=new Example()
    val objR=new RunnableExample()
    val t=new Thread(objR)
    t.setPriority(Thread.MAX_PRIORITY)
    obj.setPriority(Thread.MIN_PRIORITY)
    obj.start()
    t.start()
    println(t.getName)
    println(t.getPriority)
    println(t.isAlive)
  }
}
