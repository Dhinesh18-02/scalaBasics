package DhineshBasicsScala

object statementsAndExpressions extends App {

 // val age=12
  val age=24
  val result = if( age>=18 ){
    "you are an adult"
  }else{
   "you are not an adult"
  }
  println(s"the result is $result")


  //val someNumber=100
  //val someNumber=12
  val someNumber=31
  val r1 = if(someNumber%2 ==0 && someNumber%3 == 0 ){
    "the number is divisibe by 2 and 3"
  }else if(someNumber%2 ==0){
    "the number is divisible by 2"
  }else if( someNumber%3 == 0){
    "the number is divisble by 3"
  }else{
    "the not valid number"
  }
  println(s"the result of r1 is $r1")


//val flag= true
  val flag= false
  println(if(flag) 5 else 3)

}
