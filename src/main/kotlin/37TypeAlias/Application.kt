package `37TypeAlias`

class Application(val name: String) {
    companion object {
        fun tuUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}

typealias Aplikasi = Application
typealias App = Aplikasi

fun main() {
    val aplikasi = Aplikasi("Aplikasi Android")
    val app = App("Kotlin App")

}