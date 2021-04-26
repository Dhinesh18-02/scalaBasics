package DhineshBasicsScala.Functinal

import scala.annotation.tailrec

object recursion extends App {

  def factorial(n:Int): BigInt= {
    if(n<=1){
      1
    }else{
      n * factorial(n-1)
    }
  }
//  println(factorial(10000))   here we are facing stackoverflow error
  @tailrec
  def factorialTail(n: Int, result: BigInt):BigInt={
    if(n<=1){
      result
    }else{
      factorialTail(n-1, n*result)
    }
  }
  println(factorialTail(10000,1))
}

