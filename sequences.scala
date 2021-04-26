package DhineshBasicsScala.Collections

object sequences extends App{
//List are  Immutable - linked lists
//  head , tail, isEmpty fast with 0(1)

  val aList= List(1,2,3)
  println(aList)
  println(List.fill(10)("Hello"))
  println(aList.mkString(","))

//  Arrays are Mutable
//  they can updated in places

  val anArray= Array(1,2,3)
  println(anArray.foreach(println))
  anArray(1)=100  // here we are updating the value of index 1 of the array as 100
  println(anArray.foreach(println))



}
