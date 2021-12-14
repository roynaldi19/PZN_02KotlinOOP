package `18TypeCheck`

fun printObject(any: Any) { //any dapat menerima parameter dalam bentuk apapun
    if (any is Laptop) {
        println("Laptop whit name ${any.name}") // disini any berubah menjadi Laptop
    } else if (any is Handphone) {
        println("HandPhone whir name ${any.name}")
    } else {
        println(any)
    }

}

fun main() {
    printObject("Roy")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(Handphone("Xiomy"))

}