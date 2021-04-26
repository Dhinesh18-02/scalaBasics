package DhineshBasicsScala.Functinal

import DhineshBasicsScala.codeBlocks.y
import DhineshBasicsScala.staticallyTypedAndTypeInference.a

object anonymousFuction extends App {
// ordinary functions

//    def inc2(x: Int) = x+2
//    println(inc2(10))

//  Anonymous functions

  (x: Int) => x+2

  val IncLiteral = (x: Int) => x+2
  println(IncLiteral(10))

  (a: Int, b: Int) => a*b
  val Mul=(a: Int, b: Int) => a*b
  println(Mul(5,4))

  val getDir= ()=> System.getProperty("user.dir")
  println(getDir())

  val aList= List.range(1, 101)
  println(aList)

//  val evens = aList.filter((x: Int)=> x % 2==0)
//  println(evens)
//
//  val odds= aList.filter((x: Int)=> x % 2 == 1)
//  println(odds)
//
//  val doublelist= aList.map((x:Int)=> x*2)
//  println(doublelist)

//Above lines have boilerplate i.e(x : Int)=> x  instead of boiler plate code we can use ' _ '  underscore
  val evens = aList.filter(_ % 2 == 0)
  println(evens)

  val odds= aList.filter(_ % 2 == 1)
  println(odds)

  val doublelist= aList.map(_ *2)
  println(doublelist)

  val strings= List("Dhinesh","Babu","Ramesh","Dheekshitha","Rakesh")
  println(strings.filter(_ .length == 7))
//  strings.foreach((x : String)=> println(x))
  strings.foreach(println( _ ))
}
