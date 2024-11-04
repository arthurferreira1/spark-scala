// Flow Control

// if / else:

if (1 > 3) println("Impossible") else println("The world make sense")

if (1 > 3) {
  println("Impossible!")
  println("Really?")
} else {
  println("The world makes sense")
  println("Still.")
}

// matching

val number = 3
number match {
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
  case _ => println("Something else!")
}

for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

x = 0
do {println(x); x+=1} while (x <= 10)

//Expressions

{val x = 10; x + 20}

println({val x = 10; x + 20})

//fibonacci

var x = 0
var y = 1
var z = 0

for (z <- 1 until 34) {
  z = x + y
  x = y
  y = z
}

