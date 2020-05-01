package free_code_camp

fun main() {

    val interestingThings = arrayOf("Kotlin", "Java", "Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(1))
    println(interestingThings.get(2))

    interestingThings.forEach { println(it) }
    interestingThings.forEach { thing -> println(thing) }

    interestingThings.forEachIndexed { index, thing -> println("Index $index : $thing") }

    val myList = listOf("Java", "Python", "Kotlin")

    val numbers = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
    )

    println(numbers.get(1)) // one
    println(numbers.get(2)) // two
    println(numbers.get(3)) // three

    numbers.forEach { key, value -> println("$key : $value") }

    val myMap = mutableMapOf(
            1 to "eins",
            2 to "zwei"
    )
    myMap.put(3, "drei")
    println(myMap)


}