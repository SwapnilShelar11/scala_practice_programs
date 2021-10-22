package currency_converter

class InputToUSD(inputChoice:Int,inputAmount:Double){
  var usDoller:Double=0.0
  if(inputChoice==1) usDoller=inputAmount*0.014     //Indian Rupee
  else if(inputChoice==2) usDoller=inputAmount*1     //USD
  else if(inputChoice==3) usDoller=inputAmount*1.18   //Euro
  else if(inputChoice==4) usDoller=inputAmount*0.15    //Chinese yuan
  else if(inputChoice==5) usDoller=inputAmount*0.32     //Georgian Lari
}
