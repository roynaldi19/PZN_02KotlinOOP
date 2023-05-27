package `11ThisKeywoard`

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String? = null

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}") // this mengambil propertis student
    }

}

fun main() {
    val roy = Person()
    roy.firstName = "Roynaldi"
    roy.middleName = null
    roy.lastName= "Kidd"

    roy.sayHello("Budi", "Hartono")

}