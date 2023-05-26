package `05Constructor`

class Car(brandParam: String, soldParam: String?, yearParam: String = "2020") {
    var brand: String = brandParam
    var sold: String? = soldParam
    var year: String = yearParam

}

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