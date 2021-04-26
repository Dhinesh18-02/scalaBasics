package DhineshBasicsScala.Functinal



object varArgs extends App {
//  def concat(str1: String, str2: String):String={
//    str1 + " " + str2
//  }
//  println(concat("Dhinesh","backend-developer"))

  def concat(strs: String*): String={
    strs.mkString(",")
  }
  println(concat("hello Dhinesh"))
  println(concat("hello Dhinesh","you are a backend-developer"))
//  println(concat( Seq("hello dhinesh how are you"): _*))

  def printAll(strings: String*) {
    strings.foreach(println)
  }
  printAll("a")
  printAll("a","b")
  printAll("a","b","c")

  val fruits =List("Mango","Jackfruit","banana")
  printAll(fruits : _*)
}

