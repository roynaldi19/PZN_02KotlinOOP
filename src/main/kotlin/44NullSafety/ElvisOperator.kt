package `44NullSafety`

fun sayHello2(friend: Friend?) {
    val name = friend?.name ?: "Unknown"
    println("Hello $name")

}


fun main() {
    sayHello2(Friend("Roy"))
    sayHello2(null)
}