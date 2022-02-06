
package `07SecondaryConstructor`

fun main() {
    val avanza = Car("Toyota") //menggunakan secondari construktor 2
    avanza.year = 2015
    val almaz = Car("Wuling", "Almaz") //menggunakan secondari construktor

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}