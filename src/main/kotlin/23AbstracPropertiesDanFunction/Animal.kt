package `23AbstracPropertiesDanFunction`

abstract class Animal {
    //semua propertiies dan function abstack harus di overide di kelas turunannya
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Cat"

    override fun run() {
        println("Cat run")
    }
}

fun main() {
    val cat = Cat()
    cat.run()
}