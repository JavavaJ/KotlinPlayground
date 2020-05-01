package head_first

fun main (args: Array<String>) {
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x.")
    println("name is $name")

    for (i in 1..10) {
        x++
        println("$i $x")
    }

}