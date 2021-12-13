package `09Function`

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String? = null

    fun sayHello(name: String) {
        println("Hello $name, My name is $firstName")
    }

    fun run() {
        println("Im Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}