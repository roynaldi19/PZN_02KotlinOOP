package `07SecondaryConstructor`

class Car(brandParam: String, nameParam: String, yearParam: Int) {

    init {
        println("Car $brandParam dibuat")
    }

    constructor(brandParam: String, nameParam: String) : this(brandParam, nameParam, 2020) { // memnggil primamary constractor
        println("Secondary Construktor 1")
    }

    constructor(brandParam: String) : this(brandParam, "") { // memnaggil secondari constroktort
        println("Secondary Construktor 2")
    }

    var brand: String = brandParam
    var name: String = nameParam
    var year: Int = yearParam

}

fun main() {
    val avanza = Car("Toyota") //menggunakan secondari construktor 2
    avanza.year = 2015

    val almaz = Car("Wuling", "Almaz") //menggunakan secondari construktor

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}