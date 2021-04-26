package DhineshBasicsScala

object Functions extends App {
 //without using function
  val welcomeTextForJohn = "hello john ! your age is 30"
  val welcomeTextForDavid = "hello David ! your age is 30"

  //with using function
  def welcomeText(name: String, age: Int):String={
    s"hello $name ! your age is $age"
  }
  println(welcomeText("john",30))
  println(welcomeText("David",40))
  println(welcomeText("Dhinesh",23))

 def calculateBonus(salary: Double, exp: Int): Double={

  if(exp <=5)
  {
   salary / 10
  }
  else if(exp > 5 && exp <= 10) {
   salary /5
  }
  else{
   salary / 2
  }
 }
 //println(calculateBonus(100,6))
 println(calculateBonus(100,4))
}
