package simple_atm_machine

import java.util.Scanner

class CardValidation(){
  val cardMap=Map(1010->2515,1020->3511,1030->9887,1040->7896)
  val sc=new Scanner(System.in)
  println("Enter your Card No")
  val cardNumber=sc.nextInt()
  println("Enter your Pin")
  val cardPin=sc.nextInt()
  var flag:Boolean=false
  if(cardMap.contains(cardNumber)){
    cardMap.keys.foreach{
      key=>if(cardMap(cardNumber)==cardPin){
        flag=true
      }
    }
    if(flag) println("Valid User")
    else println("Invalid Pin")
  }else{
    println("You are not register member")
  }
}
