package `43OperatorOverloading`

data class Fruit(
    val quantity: Int
) {
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }
}

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
    val fruit3 = fruit1 + fruit2
    val fruit4 = fruit1 - fruit2

    println(fruit1)
    println(fruit2)
    println(fruit3)
    println(fruit4)
}