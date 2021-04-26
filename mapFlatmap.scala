package DhineshBasicsScala.Functinal



object mapFlatmap extends App {

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(list.map(x => x * 2))
  println(list.map(x => x * 3))


   class User(val name: String, val age: Int)

  val u1 = new User("Dhinesh", 24)
  val u2 = new User("ramesh", 34)
  val u3 = new User("Dheekshitha", 5)

  val MyList = List(u1, u2, u3)
  println( MyList.map(u=> u.name))
  println( MyList.map(u=> u.age))

//  println( MyList.filter(u=> u.age>=20)) here we need to print means we need to creat case class

  val nestedList= List(List(1,2,3), List(4,5,6),List(7,8,9))
  println(nestedList.flatMap(list=> list.map(x=> x)))
  println(nestedList.flatMap(list=> list.map(x=> x*2)))


  val numbers= List(1,2,3)
  val chars= List('a','b','c')
  val cols= List("White","red","blue")

  println(numbers.flatMap(n=> chars.flatMap(c=> cols.map(col=> (n,c,col)))))

}
