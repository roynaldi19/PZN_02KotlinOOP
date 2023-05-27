package `13FunctionOverriding`

open class Employee(val name: String) {

    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

// final untuk mengucni agar tidak bisa di override

open class Manager(name: String) : Employee(name) {

    override fun sayHello(name: String) { //membuat ulang function di kelas child
        println("Hello $name, My name is Manager ${this.name}")
    }
}

fun main() {
    val manager  = Manager("Roy")
    manager.sayHello("Eko")
}