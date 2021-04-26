package DhineshBasicsScala

object underscoreSyntax extends App{

  var age: Int = _
  println("age is " + age)

  age = 100
  println("age is " + age )

  var aFlag: Boolean = true
  println("A flag is " + aFlag )

// underscore syntax only works with 'var'. not works with 'val'  //
}
