
package `06Init`

fun main() {
    val avanza = Car("Toyota", null)
    val almaz = Car("Wuling", "Sold", "2021")

    println(avanza.brand)
    println(avanza.sold)
    println(avanza.year)
    println()
    println(almaz.brand)
    println(almaz.sold)
    println(almaz.year)
}