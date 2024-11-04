// VALUES are immutable constants.
  val hello: String = "hola!"

// VARIABLES are mutable
  var helloThere: String = hello
  helloThere = hello + " There!"
  println(helloThere)

  val immutableHeloThere = hello + " There"
  print(immutableHeloThere)

//Data Types

  val numberOne: Int = 1
  val truth: Boolean = true
  val letterA: Char = 'a'
  val pi: Double = 3.141159521
  val piSingPrecision: Float = 3.145141f
  val bingNumber: Long = 321312321
  val smallNumber: Byte = 127

  println("Here is a mess: " + numberOne + truth + letterA)

  println(f"Pi is about $piSingPrecision%.3f")

  println(f"Zero padding on the left: $numberOne%05d")

  println(s"I can use the s prefix to use varialbes like $numberOne $bingNumber")

  println(s"The s prefix isn't limited to variables; I can include any expressions. Like ${1+2}")

  val theUltimateAnswer: String = "To life, the universe, is 42"
  val pattern = """.* (\d+).*""".r

  val pattern(answerString) = theUltimateAnswer
  val answer = answerString.toInt

  println(answer)

// Booleans

  val isGreater = 1 > 2
  val isLesser = 1 < 2
  val impossible = isGreater & isLesser
  val anotherWay = isGreater || isLesser

  val picard: String = "Picard"
  val bestCaptain: String = "Picard"
  val isBest: Boolean = picard == bestCaptain

  val pi: Double = 3.141561d

  println(f"The value of pi is about $pi%.3f")