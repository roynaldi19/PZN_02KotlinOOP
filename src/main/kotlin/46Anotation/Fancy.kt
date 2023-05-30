package `46Anotation`


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)

@Fancy(author = "Roy")
class MyAplication(val name: String, val version: Int) {
    fun info(): String = "Aplication $name-$version"
}

fun main() {
    val myAplication = MyAplication("Kotlin", 1)
    println(myAplication.info())
}
