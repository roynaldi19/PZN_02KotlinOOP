package `11ThisKeywoard`

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String? = null

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}") // this mengambil propertis student
    }

}