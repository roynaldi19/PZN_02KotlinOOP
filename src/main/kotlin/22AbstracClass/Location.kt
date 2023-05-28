package `22AbstracClass`

abstract class Location(val name: String) // tidak bisa dibuat objek, hanya bisa di warisi

class City(name: String) : Location(name)

fun main() {
    val city = City("Pekanbaru")
}