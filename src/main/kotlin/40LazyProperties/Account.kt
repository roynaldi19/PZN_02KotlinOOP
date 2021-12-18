package `40LazyProperties`

class Account {
    val name: String by lazy {
        println("Name is Called")
        "Roy"
    }
}