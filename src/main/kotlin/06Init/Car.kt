package `06Init`

class Car(brandParam: String, soldParam: String?, yearParam: String = "2000" ) {

    init {
        println("kode program ini di eksekusi setiap ada objek di buat dari kelas ini, ini dieksekusi pada objek $brandParam")
    }

    var brand: String = brandParam
    var sold: String? = soldParam
    var year: String = yearParam

}

fun main() {
    val toyota = Car("Avanza", null)
    val wuling = Car("Almaz", "Sold", "2021")

    println()

    println(toyota.brand)
    println(toyota.sold)
    println(toyota.year)
    println()
    println(wuling.brand)
    println(wuling.sold)
    println(wuling.year)
}