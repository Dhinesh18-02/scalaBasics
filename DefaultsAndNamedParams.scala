package DhineshBasicsScala.Functinal

import DhineshBasicsScala.codeBlocks.y

object DefaultsAndNamedParams extends App {
//default param
    def add(x:Int,y:Int=40) = x+y
//    println(add(10,10))
    println(add(10))
//here we have to rearrange the parameter y and z
  def add3(x: Int,z: Int,y: Int = 24): Int = x +y+ z
//  println(add3(3,4,5))
  println(add3(5,20))

//  named params
  def namedAdd(x: Int,y: Int = 20,z: Int)= x+y+z
  println(namedAdd(10,z= 30))
//  we can use named params for without changing the order of defined parameters
}


