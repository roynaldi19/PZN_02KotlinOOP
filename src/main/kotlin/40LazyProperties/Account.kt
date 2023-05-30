package `40LazyProperties`

class Account {
    val name: String by lazy {
        println("Name is Called")
        "Roy"
    }
}

fun main() {
    val account = Account()
    println(account.name)
    println(account.name)

}




