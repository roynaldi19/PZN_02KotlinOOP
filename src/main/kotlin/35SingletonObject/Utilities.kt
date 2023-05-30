package `35SingletonObject`

object Utilities {
    val name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.toUpperCase()
    }
}

fun main() {
    val result = Utilities.toUpper("Roy")
    println(result)
    println(Utilities.name)

}