package `08PropertiesDiConstruktor`

class User(var userName: String, var pass: String) {

}

fun main() {
    val user1 = User("Roynaldi", "rahasia")
    val user2 = User("Roynaldi123", "rahasia123")

    user1.userName = "eko"
    user1.pass = "master"

    println(user1.userName)
    println(user1.pass)
    println(user2.userName)
    println(user2.pass)
}