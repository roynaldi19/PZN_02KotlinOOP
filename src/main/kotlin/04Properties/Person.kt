package `04Properties`

class Person {
    var firstName: String = ""
    var midletName: String? = null
    var lastName: String? = null
}

fun main() {
    val roy = Person()
    roy.firstName = "Roynaldi"
    roy.midletName = null
    roy.lastName = "Kidd"

    println(roy.firstName)
    println(roy.midletName)
    println(roy.lastName)
}