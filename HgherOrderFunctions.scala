package DhineshBasicsScala.Functinal

object HgherOrderFunctions extends App {

  val ourCharge=10
  val ProviderAcharge = (x:Double) => x / 10
  val ProviderBcharge = (x: Double)=> x/ 5

  def transferMoney(x: Double,pcharge: Double=> Double): Double ={
    x- ourCharge -  pcharge(x)
  }

  println(transferMoney( 100, ProviderAcharge ))
  println(transferMoney( 100, ProviderBcharge ))
}
