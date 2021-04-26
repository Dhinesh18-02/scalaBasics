package DhineshBasicsScala

import DhineshBasicsScala.staticallyTypedAndTypeInference.a
import lectures.part1basics.Expressions.i
import lectures.part2oops.Objects.dhinesh

object multilineString extends App {

  val aString = "hi hello"
  val multilineString= """hi greetings,
  #this is dhinesh and
    #i am a back end developer""".stripMargin('#')

  println(multilineString)

  val name ="dhinesh"
  val age= 23

  val anotherMultistring=
    s"""
      |Hi my name is $name,
      |and my age is $age
      |""".stripMargin('|')

  println(anotherMultistring)


}
