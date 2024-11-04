// Functions

def squareIt(x: Int): Int = {
  x * x
}

println(squareIt(2))

def cubeIt(x: Int) : Int = {x * x * x}

println(cubeIt(3))

def transformInt(x: Int, f: Int => Int): Int = {
  f(x)
}

val result = transformInt(2, cubeIt)

transformInt(3, x => x * x * x)

transformInt(10, x => x / 2)

transformInt(2, x => {val y = x * 2; y * y})

def transformUpper(x: String): String = {
  x.toUpperCase()
}

def transformUpper(x: String, f: String => String): String = {
  f(x)
}

transformUpper("b", x => x.toUpperCase())