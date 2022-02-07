package `44NullSafety`


fun sayHello3(friend: Friend?) {
    val name = friend!!.name // operator ini tidak mengizinkan null
    println("Hello $name")
}


fun main() {
    sayHello3(Friend("Roy"))
    sayHello3(null)
}