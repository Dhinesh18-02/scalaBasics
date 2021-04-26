package DhineshBasicsScala


object stringInterpolation extends App {

   val name= "dhinesh"
   val age=23

   println(" hello I am " + name + " and my age is " + age)

  println(s"hello I am $name and my age is $age")

  println(s"1+1= ${1+1}")

  case class Student (name: String, age: Int)

      val student = Student("babu", 25)

    println(s"hello I am ${student.name} and my age is ${student.age}")

  val height=6.36453

  println(f"hello I am ${student.name} and my age is ${student.age} and my height is $height")
  println(f"hello I am ${student.name} and my age is ${student.age} and my height is $height%.2f")
  println(f"hello I am ${student.name} and my age is ${student.age} and my height is $height%.1f")
}
