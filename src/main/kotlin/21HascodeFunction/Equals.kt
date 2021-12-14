package `21HascodeFunction`

fun main() {
    val company1 = Company("Roy Tech")
    val company2 = Company("Roy Tech")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}