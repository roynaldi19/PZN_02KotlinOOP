package `39Delegation`

interface Base {
    fun sayHello(name: String)
}

class MyBase : Base{
    override fun sayHello(name: String) {
        println("Heloo $name")
    }
}

class MyBaseDelegate(val base: Base): Base by base 

fun main() {
    val base = MyBase()
    base.sayHello("Roy")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Eko")
}