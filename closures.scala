package DhineshBasicsScala.Functinal

object closures extends App{
  val myclosure = new Myclosure
  println(myclosure.Sayhello("Dhinesh"))

  myclosure.age=24
  println(myclosure.Sayhello("Dhinesh"))

}
class Myclosure{

  var age=23

  def Sayhello(name : String):String={
    s"Hi my name is $name, and my age is $age"
  }
}
