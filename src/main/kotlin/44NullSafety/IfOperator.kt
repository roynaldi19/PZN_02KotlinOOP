package `44NullSafety`

fun sayHello4(friend: Friend?) {
    if (friend != null) {
        println("Hello ${friend.name}")
    } else {
        println("Hello Unknown")
    }
}

fun main() {
    sayHello4(Friend("Roy"))
    sayHello4(null)
}