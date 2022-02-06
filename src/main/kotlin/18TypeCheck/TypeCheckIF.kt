package `18TypeCheck`

fun printObject(any: Any) { //any dapat menerima parameter dalam bentuk apapun
    if (any is Laptop) { //is untuk pengecekan dan !is untuk bukan
        println("Laptop whit name ${any.name}") // disini any berubah menjadi Laptop
    } else if (any is HandPhone) {
        println("HandPhone whit name ${any.name}")
    } else {
        println(any)
    }

}

fun main() {
    printObject("Roy")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Xiomy"))

}