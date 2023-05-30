package `41ObservableProperties`

import kotlin.properties.Delegates

class Account(description: String = "") {
    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}

fun main() {
    val account = Account()
    account.description = "Contoh"
    account.description = "Di Ubah"
    account.description = "Hello World"
}