package `19ToStringFunction`

class User(var userName: String, var pass: String) {
    override fun toString(): String {
        return "User whit username $userName"
    }

}

fun main() {
    val user = User("Roynaldi", "rahasia")
    println(user)
}