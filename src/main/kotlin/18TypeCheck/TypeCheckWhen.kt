package `18TypeCheck`

fun printObjectWhitWhen(any: Any) { //any dapat menerima parameter dalam bentuk apapun
    when (any) {
        is Laptop -> {
            println("Laptop whit name ${any.name}") // disini any berubah menjadi Laptop
        }
        is Handphone -> {
            println("HandPhone whir name ${any.name}")
        }
        else -> {
            println(any)
        }
    }

}

fun main() {
    printObjectWhitWhen("Roy")
    printObjectWhitWhen(1)
    printObjectWhitWhen(Laptop("Acer"))
    printObjectWhitWhen(Handphone("Xiomy"))

}