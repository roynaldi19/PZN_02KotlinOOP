package `46Anotation`

@Fancy(author = "Roy")
class MyAplication(val name: String, val version: Int) {
    fun info(): String = "Aplication $name-$version"
}