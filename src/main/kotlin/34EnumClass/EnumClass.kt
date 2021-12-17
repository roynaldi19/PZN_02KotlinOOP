package `34EnumClass`

fun main() {
    val man = Gender.MAN
    val woman = Gender.WOMAN
    val all: Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(all.toList())
}