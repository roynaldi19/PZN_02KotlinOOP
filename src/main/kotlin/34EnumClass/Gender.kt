package `34EnumClass`

 // digunkan untuk kelas yng suadah baku / tetap contoh jenis kelamin
enum class Gender {
    MAN,
    WOMAN
}

fun main() {
    val man = Gender.MAN
    val woman = Gender.WOMAN
    val all: Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(all.toList())
}