
package `07SecondaryConstructor`

fun main() {
    val toyota = Car("Avanza")
    toyota.year = 2015
    val wuling = Car("Almaz", "Wuling")

    println(toyota.brand)
    println(toyota.year)
    println(wuling.brand)
    println(wuling.year)
}