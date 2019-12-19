fun main(args: Array<String>) {
    // runCollections()
    someHashMaps()
}

fun runCollections() {
    val integers: IntArray = intArrayOf(1, 3, 4, 5, 6)
    println("int array: " + integers)

    var numbers: MutableList<Int> = mutableListOf(3, 6, 8, 9, 2)
    println("numbers list before: " + numbers)

    numbers.add(7)
    println("numbers list after: " + numbers)

    var myList = ArrayList<String>()
    myList.add("bus")
    myList.add("car")
    myList.add("train")
    myList.add("car")
    myList.add("bus")
    myList.add("car")
    myList.add("train")

    for (elem in myList) {
        println(elem)
    }

    println(myList.lastIndexOf("car")) // prints out the last
    // occurence of "car" which is 5

}

private fun someHashMaps() {
    var myMap = hashMapOf("one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4)
    println(myMap["two"])

    for (i in 1..20) {
        print("$i ")
    }
    println()

    for (i in 50 downTo 30) {
        print("$i ")
    }

}