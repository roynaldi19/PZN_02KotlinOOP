package `50Polymorphism`

open class Employe(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name: String) : Employe(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

class ViceManager(name: String): Manager(name){
    final override fun sayHello(name: String) { // final agar tidak dapat lagi di override
        println("Hello $name, My name is Vice Manager ${this.name}")
    }
}

class Supervisor(name: String) : Employe(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is Supervisor ${this.name}")
    }
}