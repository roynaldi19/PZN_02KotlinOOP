package `10FunctionOverLoading`

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String? = null

    fun sayHello(name: String) {
        println("Hello $name, My name is $firstName")
    }
    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, My Name is $firstName")
    }

}

fun main() {
    val roy = Person()
    roy.firstName = "Roynaldi"
    roy.middleName = null
    roy.lastName= "Kidd"

    roy.sayHello("Budi")
    roy.sayHello("Budi", "Hartono")

}