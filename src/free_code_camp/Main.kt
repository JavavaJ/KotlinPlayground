package free_code_camp

val name: String = "Alex"
var greeting: String? = null // nullable string

fun main() {
    greeting = "Hello, "
    if (greeting != null) {
        println(greeting)
    }
    println(name)
}