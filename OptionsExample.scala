package DhineshBasicsScala.Options

object OptionsExample extends App{

//  An option is a containter for Optional values

      val name= "DHinesh"
      val MaybeName: Option[String]= Option(name)
      println(MaybeName)

      val name1= null
      val MaybeName1: Option[String]= Option(name1)
      println(MaybeName1)

//  No more Null pointer Excepions
// Never call get operations before using IsDefined() check
     println(Option(name).get)


    val myOption= Option(name)
    if(myOption.isDefined){
      println(myOption.get)
    }else{
      println("there is no value")
    }
  println(myOption)

  val myOption1= Option(name1)
    if(myOption1.isDefined){
      println(myOption1.get)
    }else{
      println("there is no value")
    }
  println(myOption1)

//  getOrElse

  println(myOption.getOrElse("Some defalut value"))
  println(myOption1.getOrElse("Some defalut value"))


}
