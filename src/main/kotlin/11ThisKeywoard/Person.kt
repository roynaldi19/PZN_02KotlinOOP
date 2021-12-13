package `11ThisKeywoard`

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String? = null

    fun sayHello(name: String) {
        println("Hello $name, My name is $firstName")
    }
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

}