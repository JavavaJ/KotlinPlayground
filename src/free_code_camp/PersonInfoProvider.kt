package free_code_camp

interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = BasicInfoProvider()

    val person = Person()
    provider.printInfo(person)
    val sessionId = provider.getSessionId()
    println(sessionId)
    checkTypes(provider)

    println()

    val fancyProvider = FancyInfoProvider()
    fancyProvider.printInfo(person)
    println(fancyProvider.getSessionId())

    println()

    val anonymousProvider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "Anonymous Info Provider"

        fun getSessionId() = "Session Id"
    }

    anonymousProvider.printInfo(person)
    println(anonymousProvider.getSessionId())

}

fun checkTypes(infoProvider : PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("is NOT a session info provider")
    } else {
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}
