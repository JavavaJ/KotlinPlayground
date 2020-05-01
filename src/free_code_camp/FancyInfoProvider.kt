package free_code_camp

class FancyInfoProvider : BasicInfoProvider() {
    override val sessionIdPrefix: String
        get() = "Fancy session"

    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}