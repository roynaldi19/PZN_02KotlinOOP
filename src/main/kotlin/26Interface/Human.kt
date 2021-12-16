package `26Interface`

class Human(override val name: String) : Interaction, Go { // boelh exten lebioh dari ke 1 parent pada interface
    override fun sayHello(name: String) {
        println("Hello $name my name is ${this.name}")

    }
}