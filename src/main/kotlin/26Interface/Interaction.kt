package `26Interface`

interface Interaction {
    val name: String
    fun sayHello(name: String){
        println("Hello $name my name is ${this.name}")
    }
}

interface Go : Interaction { // saling extend antar interface
    fun go() {
        println("Go!")
    }
}

class Human(override val name: String) : Interaction, Go  // boelh exten lebioh dari ke 1 parent pada interface

fun main() {
    val human = Human("Roy")
    human.sayHello("Budi")
    human.go()
}
