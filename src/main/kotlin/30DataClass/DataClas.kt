package `30DataClass`

fun main() {
    val product = Product("Indomie", 3500, "Food")

    val product2 = product.copy()

    val product3 = product.copy("Sarimi")

    println(product)
    println(product2)
    println(product3)

}