package DhineshBasicsScala.Functinal

object MethodsvsFunctions extends App {

  def inc(x: Int)= x + 1

  val incFun=(x: Int)=> x+1

  new Function1[Int,Int]{
    override def apply(x: Int): Int= x+1
  }
}
