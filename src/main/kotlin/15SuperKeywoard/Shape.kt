package `15SuperKeywoard`

open class Shape {
    open val corner: Int = -1
}

class Rectangle : Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner
}

class Triangle : Shape() {
    override val corner: Int = 3
}