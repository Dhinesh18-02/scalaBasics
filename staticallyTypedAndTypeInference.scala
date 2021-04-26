package DhineshBasicsScala

object staticallyTypedAndTypeInference extends App {
//type inference //
  val aFloat = 10.5
  println(aFloat.getClass)

  val anInt =10
  println(anInt.getClass)

  //statically typed //
//  val a:Int = true  ' here we couldnt declare another type i.e) true which is Boolean
   val a:Int = 25
  println(" value of a is " +a)
}
