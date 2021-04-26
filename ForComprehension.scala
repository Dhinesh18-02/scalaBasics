package DhineshBasicsScala.Functinal

object ForComprehension extends App {

  val ints= List(1,2,3,4,5,6,7,8,9,10)
  println(ints.map(x=> x * 2))

  val result=for{
    x <- ints
  } yield x * 2

  println(result)

  val chars=List('a','b','c','d')
  println(chars.map(x=> x.toUpper))


  val newChar= for{
    x<- chars
  } yield x.toUpper

  println(newChar)



 case class User( name: String, age: Int)

  val u1 = User("Dhinesh", 24)
  val u3 = User("Dheekshitha", 5)
  val u2 = User("ramesh", 34)

  val users= List(u1,u2,u3)
  println(users.map(_.name))

  val newUsers=for{
    x<- users
  } yield x.name

  println(newUsers)
//  using filters

  println(users.filter(_.age>=20).map(_.name))

  val newList1= for{
    x<- users if x.age >=20
  } yield x.name

  println(newList1)


  val numbers= List(1,2,3)
  val chars1= List('a','b','c')
  val cols= List("White","red","blue")

  println(numbers.flatMap(n=> chars1.flatMap(c=> cols.map(col=> (n,c,col)))))

  val newComb= for{
    n<- numbers
    c<- chars1
    col<- cols
  } yield (n,c,col)

  println(newComb)


}
