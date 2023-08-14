object Q3 extends App{
  val names = List("Benny", "Niroshan", "Saman", "Kumara")
  val formats = List("All_UC", "FirstTwo_UC", "All_LC", "FirstLast_UC")

  val toUpper: String => String = str => str.toUpperCase
  val toLower: String => String = str => str.toLowerCase

  val formatNames: (String, String) => String = (Name, format) => {
    format match{
      case f if f == "All_UC" => toUpper(Name)
      case f if f == "FirstTwo_UC" => toUpper(Name.substring(0, 2)) + toLower(Name.substring(2, Name.length))
      case f if f == "All_LC" =>toLower(Name)
      case f if f == "FirstLast_UC" => toUpper(Name.head.toString) + toLower(Name.substring(1,Name.tail.length)) + toUpper(Name.substring(Name.tail.length))
    }
  }

  var i = 0;
  names.foreach { name =>
      println("Name: " + name + "\nFormatted Name: " + formatNames(name, formats(i))+ "\n")
      i=i+1
  }
}
