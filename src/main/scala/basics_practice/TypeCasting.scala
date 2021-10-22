package basics_practice

//byte --> short --> int -->long -->Float-->Double
object TypeCasting {
  @main def start ={
    val any:Any="ghvg"
    println("Hashcode of any is "+any.hashCode())
    var int:Int=10
    var long:Long=int
    //val short:Short=int       //Casting is unidirectional
    var float:Float=int
    var double1:Double=long
    //val char:Char=int
    //float=double1
    var char1:Char='c'
    int=char1
    long=char1
    float=char1
    double1=char1
    println(int+" "+long+" "+char1+" "+double1+" "+float)
    val x: Long = 987654321
    val y: Float = x  // (note that some precision is lost in this case)

    val face: Char = '☺'
    val number: Int = face
    println(y+" "+number)

  }
}
