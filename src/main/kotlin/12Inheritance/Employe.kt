package `12Inheritance`

open class Employee(val name: String){
    fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name:String): Employee(name) { // Manager mewarisi semua Employee
}

class Supervisor(name: String): Manager(name) { //supervisor mewarisi Employee dari manager
}