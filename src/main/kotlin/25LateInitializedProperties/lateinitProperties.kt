package `25LateInitializedProperties`

fun main() {
    val television = Television()
    television.brand = "Samsung"
    println(television.brand)
}