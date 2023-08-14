object Q1 extends App{
  val calculateInterest: Double => Double = dep_Amount => {
    if (dep_Amount > 0 && dep_Amount < 20000)
      dep_Amount * 0.02
    else if (dep_Amount < 200000)
      dep_Amount * 0.04
    else if (dep_Amount < 2000000)
      dep_Amount * 0.035
    else
      dep_Amount * 0.065
  }

  print("Enter the deposit amount : ")
  val deposit_Amount = scala.io.StdIn.readDouble()
  val interest = calculateInterest(deposit_Amount)
  println("The interest earned : "+ interest);
}
