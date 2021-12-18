package `39Delegation`

fun main() {
    val base = MyBase()
    base.sayHello("Roy")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Eko")
}