object Q2 extends App{
  print("Enter an integer : ")
  val integer_input = scala.io.StdIn.readInt()

  val patternMatching:Int => String = {
    case num if num <= 0 => "Negative/Zero"
    case num if num % 2 == 0 => "Even"
    case _ => "Odd"
  }

  patternMatching(integer_input)
}
