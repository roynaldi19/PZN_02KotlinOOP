package `50Polymorphism`


//kemampuan class berubah bentuk
open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

class ViceManager(name: String): Manager(name){
    final override fun sayHello(name: String) { // final agar tidak dapat lagi di override
        println("Hello $name, My name is Vice Manager ${this.name}")
    }
}

class Supervisor(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is Supervisor ${this.name}")
    }
}

fun main() {
    var employee = Employee("Roy")
    employee.sayHello("Budi")

    employee = Manager("Roy")
    employee.sayHello("Budi")

    employee = ViceManager("Roy")
    employee.sayHello("Budi")

    employee = Supervisor("Roy")
    employee.sayHello("Budi")
}