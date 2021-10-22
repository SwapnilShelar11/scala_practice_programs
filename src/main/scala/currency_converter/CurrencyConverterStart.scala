package currency_converter

import java.util.Scanner

class CurrencyConverterStart {
  val sc= new Scanner(System.in)
  def start(): Unit ={
    var flag:Boolean=true
    println("\tWelcome to Currency Converter")
    while(flag) {
      println("\tMenu")
      println("\t1.Start\n\t2.Quite")
      val menuChoice:Int=sc.nextInt()
      if(menuChoice==1) {
        var flagIpOp: Boolean = true
        while(flagIpOp) {
          println("\t Select Input Currency\n\t1.Indian Rupe\n\t2.USA\n\t3.Euro\n\t4.Chinese yuan\n\t5.Georgian Lari")
          val inputChoice: Int = sc.nextInt()
          println("Enter input amount")
          val inputAmount: Double = sc.nextDouble()
          println("\t Select Output Currency\n\t1.Indian Rupe\n\t2.USA\n\t3.Euro\n\t4.Chinese yuan\n\t5.Georgian Lari")
          val outputChoice: Int = sc.nextInt()
          if (inputChoice <= 5 && outputChoice <= 5) {
            val objInput = new InputToUSD(inputChoice, inputAmount)
            val objOutput = new USDToOutput(outputChoice, objInput.usDoller)
            println("Converted Amount would be "+objOutput.outputAmount)
            flagIpOp=false
          } else println("Please enter valid inputs...")
        }
      }else if(menuChoice==2){
        flag=false
        println("Thanks for using Currency Converter...!")
      }else println("Please enter valid input Choice...")
    }
  }
}
