package `12Inheritance`

open class Employe(val name: String){
    fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name:String): Employe(name) {
}

class Supervisor(name: String): Manager(name) {
}