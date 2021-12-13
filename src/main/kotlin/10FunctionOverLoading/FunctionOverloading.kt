package `10FunctionOverLoading`

fun main() {
    val roy = Person()
    roy.firstName = "Roynaldi"
    roy.middleName = null
    roy.lastName= "Kidd"

    roy.sayHello("Budi")
    roy.sayHello("Budi", "Hartono")

}