package `26Interface`

interface Interaction {
    val name: String
    fun sayHello(name: String){
        println("Hello $name my name is ${this.name}")

    }
}