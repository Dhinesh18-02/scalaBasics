package DhineshBasicsScala.Trypackage

import java.net.URL
import scala.util.{Failure, Success, Try}

object TryExample extends App{

  val result = Try{
    10/2
  }
  result match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }
  println(result)

  Try{
    new URL("https://www.google.com")
  }match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }

}
