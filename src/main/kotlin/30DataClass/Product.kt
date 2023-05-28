package `30DataClass`

data class Product(
    val name: String,
    val price: Int,
    val category: String
)

fun main() {
    val product = Product("Indomie", 3500, "Food")
    val product2 = product.copy()
    val product3 = product.copy(name = "Sarimi", category = "Food level2")

    println(product)
    println(product2)
    println(product3)

}