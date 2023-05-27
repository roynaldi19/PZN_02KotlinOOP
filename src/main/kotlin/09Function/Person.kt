package `09Function`

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String? = null

    fun sayHello(name: String) {
        println("Hello $name, My name is $firstName")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}

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