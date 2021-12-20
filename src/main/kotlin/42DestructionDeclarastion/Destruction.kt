package `42DestructionDeclarastion`

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

fun main() {
    val(min, max) = MinMax(10, 100)
    println(min)
    println(max)

}