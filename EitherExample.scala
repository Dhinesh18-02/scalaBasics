package DhineshBasicsScala.Either

import DhineshBasicsScala.codeBlocks.y

object EitherExample extends App{

  val myEither: Either[String , Int]= Left("Some messege")
  val myEither1: Either[String , Int]= Right(10)
  println(myEither)
  println(myEither1)

  def div(x: Int, y: Int): Either[String,Double]={
    if(y == 0){
      Left("we cant divide by 0")
    }else{
      Right(x/y)
    }
  }
  val result=div(100,3)

  result match {
    case Left(m)=> println(m)
    case Right(r)=> println(r)
  }
  println(result)

}
