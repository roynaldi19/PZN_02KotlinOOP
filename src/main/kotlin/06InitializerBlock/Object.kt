
package `06InitializerBlock`

fun main() {
    val toyota = Car("Avanza", null)
    val wuling = Car("Almaz", "Sold", "2001")

    println(toyota.brand)
    println(toyota.sold)
    println(toyota.year)
    println(wuling.brand)
    println(wuling.sold)
    println(wuling.year)
}