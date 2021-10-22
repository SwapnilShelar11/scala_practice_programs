package serialization_deserialization
import java.io._
case class Employee(id:Int,name:String,salary:Int) extends Serializable
object SerializationPractice {
  def main(args:Array[String]): Unit ={
    val fout=new FileOutputStream(".\\record.src",true)
    val oout=new ObjectOutputStream(fout)
    val emp=Employee(10,"Swapnil",10000)
    oout.writeObject(emp)
    oout.flush()
    oout.close()

    val fipt=new FileInputStream(".\\record.src")
    val oipt=new ObjectInputStream(fipt)
    val e=oipt.readObject()
    println(e)
    oipt.close()
  }
}
