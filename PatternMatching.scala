package DhineshBasicsScala.patterns

object PatternMatching extends App{


  val x: Int= 24

  x match {
    case n if n %2 == 0 => print(s"$x is an even number")
    case n if n %2 == 1 => print(s"$x is an Odd number")
    case _ => println("  the number is either odd or even")
  }
}
