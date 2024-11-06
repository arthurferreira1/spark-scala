// Data structures

// Tuples
// Immutable Lists

val captainStuff = ("Picard", "Enterprise-D", "NCC=1801-d")

println(captainStuff)

// Refer to individual fields

println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardsShip = "Picard" -> "Enterprise-D"
println(picardsShip._2)

val aBunchStuff = ("Kirk", 1964, true)

//lists
//Like a tuple mas mais funcional

val shipList = List("Enterprise", "Defiant", "Voyager")

println(shipList(1))

println(shipList.head)
println(shipList.tail)

for (ship <- shipList) {println(ship)}

val backwardShips = shipList.map((ship: String) => {ship.reverse})
for (ship <- backwardShips) {println(ship)}

// reduce() to combine togheter all the itens

val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce((x: Int, y: Int) => x + y)
println(sum)

//filter() removes stuff

val iHateFives = numberList.filter((x: Int) => x != 5)
val iHateThress = numberList.filter(_ != 3)

// Concatenate Lists

val moreNumbers = List(6, 7, 8)
val lotsOfNumbers = numberList ++ moreNumbers

val reversed = numberList.reverse
val sorted = reversed.sorted

val lotsOfDuplicates = numberList ++ numberList

val distinctValues = lotsOfDuplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasThree = iHateThress.contains(3)

val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D")

println(shipMap("Kirk"))

println(shipMap.contains("Archer"))

val archersShip = util.Try(shipMap("Archer")) getOrElse "Uknown"
println(archersShip)