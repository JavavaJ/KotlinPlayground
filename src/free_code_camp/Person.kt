package free_code_camp

class Person(val firstName: String = "Joe", val lastName: String = "Doe") {

    var nickname: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }
    get() {
        println("The returned value is $field")
        return field
    }

    fun printInfo() {

//      val nickNameToPrint = if (nickname != null) nickname else "no nickname"
        val nickNameToPrint = nickname ?: "no nickname" // is identical to a line above


        println("$firstName ($nickNameToPrint) $lastName")
    }

//    init {
//        println("Init 1")
//    }
//
//    constructor() : this("Joe", "Rogan") {
//        println("Secondary constructor")
//    }
//
//    init {
//        println("Init 2")
//    }

}