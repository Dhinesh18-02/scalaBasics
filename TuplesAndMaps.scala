package DhineshBasicsScala.Collections

object TuplesAndMaps extends App{
// tuples are finate ordered lists


  val tuple = Tuple2(1,2)
  println(tuple._2)
  println(tuple)
  println(tuple.swap)


//  Map key -> value structure

  val aMap = Map(1-> "US",2-> "UK",3->"IN",4->"CNA")
  println(aMap)
  val updatedMap= aMap + (5 -> "GE")
  println(updatedMap)
  val removed = aMap -1
  println(removed)
//  contains key
  println(aMap.contains(4))
  println(aMap.contains(40))
//  get
  println(aMap.get(3))
  println(aMap.get(40))
}
