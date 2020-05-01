package free_code_camp

fun main() {
//    greetPerson()
//    greetPerson("Hi")
//    greetPerson("Hi", "John")

    val person = Person("John", "Doe")
//    println(person.firstName)
//    println(person.lastName)
//
//    println()
//
//    val person2 = Person();
//    println(person2.firstName)
//    println(person2.lastName)

//    person.nickname = "Shades"
//    println(person.nickname)

    person.printInfo()
}

fun greetPerson(greeting: String = "Hello", name: String = "world") {
    println("$greeting, $name")
}

fun getGreeting(greeting: String, name: String): String {
    return "$greeting, $name"
}



fun sayHello(person: String) = println("Hello $person")

fun sayHelloMultiple(greeting: String, vararg subjects: String) {
    subjects.forEach { println("$greeting, $it") }
}
