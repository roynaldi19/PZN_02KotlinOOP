package `25LateInitializedProperties`

class Television {
    lateinit var brand: String
}

fun main() {
    val television = Television()
    television.brand = "Samsung"
    println(television.brand)
}