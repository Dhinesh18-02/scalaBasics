package DhineshBasicsScala.Functinal

import DhineshBasicsScala.codeBlocks.{x, y}

object CbvAndCbn extends App {

  def getTime()={
    println("inside getTime")
    System.nanoTime()
  }

  def con(y: => Long){
    println(" inside of call by name")
    println(s"time is $y")
    println(s"time is $y")
  }

  def cov(x: Long){
    println( "inside of call by value")
    println(s"time is $x")
    println(s"time is $x")
  }

  con(getTime)
  cov(getTime)

}
