package DhineshBasicsScala.Functinal

import DhineshBasicsScala.codeBlocks.y
import DhineshBasicsScala.staticallyTypedAndTypeInference.a

object nestedFunctions extends App {

  def avg(x: Double,y:Double,z: Double): Double= {
    def sum = x + y + z
    sum / 3
  }
  println(avg(2.0,4.0,6))


  // another example for nested function


  def maxOf3(x: Int,y: Int,z: Int): Int={
    def maxOf2(a:Int,b:Int):Int= if(a>=b) a else b
    maxOf2(maxOf2(x,y),z)
  }
  println(maxOf3(5,6,4))
}
