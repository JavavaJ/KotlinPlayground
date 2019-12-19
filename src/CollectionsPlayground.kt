fun main(args: Array<String>) {
    runCollections()
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

    println(myList.lastIndexOf("car"))



}