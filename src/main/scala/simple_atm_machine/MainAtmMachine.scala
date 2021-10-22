package simple_atm_machine

import java.util.Scanner

class MainAtmMachine {
  val sc=new Scanner(System.in)
  println("Welcome to ATM Machine")
  val objvalid=new CardValidation()
  if(objvalid.flag){
    println("Welcome in your account")
    var flagMain:Boolean=true
    while(flagMain) {
      println("Main Menu")
      println("1.Balance Check")
      println("2.Withdraw")
      println("3.Deposite")
      val choiceMain:Int=sc.nextInt()
      if(choiceMain==1){

      }else if(choiceMain==2){

      }else if(choiceMain==3){

      }else{
        println("Please enter valid choice")
      }
    }
  }
}
