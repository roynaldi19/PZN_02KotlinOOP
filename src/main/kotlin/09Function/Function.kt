package `09Function`

fun main() {
    val roy = Person()
    roy.firstName = "Roynaldi"
    roy.middleName = null
    roy.lastName= "Kidd"

    roy.sayHello("Budi")
    roy.run()

    val fullName = roy.getFullName()
    println(fullName)
}