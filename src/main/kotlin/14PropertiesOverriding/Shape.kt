package `14PropertiesOverriding`

open class Shape {
    open val corner: Int = -1
}

class Rectangle : Shape() {
    override val corner: Int = 4
}

class Triangle : Shape() {
    override val corner: Int = 3
}

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}