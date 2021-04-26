package DhineshBasicsScala.Functinal

object currying extends App {

  def computeTotal(vat: Double,servicecharge: Double,productprice: Double):Double=
    productprice + productprice * servicecharge /100 + productprice * vat /100

  val currying = (computeTotal _).curried
  val serviceApllied=currying(20)
  val vatapplied = serviceApllied(10)

  val finalproduct=vatapplied(120)

  println(finalproduct)
}
