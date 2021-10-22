package currency_converter

class USDToOutput(outputChoice:Int,usDoller:Double){
  var outputAmount:Double=0.0
  if(outputChoice==1) outputAmount=usDoller*73.29    //Indian Rupee
  else if(outputChoice==2) outputAmount=usDoller*1     //USD
  else if(outputChoice==3) outputAmount=usDoller*0.85  //Euro
  else if(outputChoice==4) outputAmount=usDoller*6.47    //Chinese yuan
  else if(outputChoice==5) outputAmount=usDoller*3.12     //Georgian Lari
}
