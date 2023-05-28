package `20EqualsFunction`

class Company(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Company -> name == other.name
            else -> false
        }
    }
}

fun main() {
    val company1 = Company("Roy Tech")
    val company2 = Company("Roy Tech")

    println(company1 == company2)
}