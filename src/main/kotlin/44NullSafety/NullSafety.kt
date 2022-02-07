package `44NullSafety`

fun sayHello(friend: Friend?) {
    println("Hello ${friend?.name}")
}

fun main() {
    sayHello(Friend("Roy"))
    sayHello(null)
}