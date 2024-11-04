val listOfNumbers = (1 to 20).toList

for (number <- listOfNumbers) {
  if (number % 3 == 0)
    println(number)
}

val filterList = listOfNumbers.filter(_ % 3 == 0)
println(filterList)

