package `45Exception`

fun validateSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateSayHello("Roy")
        validateSayHello("")
        println("Program") //baris ini tidak di eksekusi karna diatas nya error dan program loncat ke catch

    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
//    } catch (error: Throwable) {
//        println("Terjadi Error ${error.message}")
    } finally {
        println("Program selesai") // blok ini pasti akan di eksekusi apapun keadaannya, walaupun terjadi error di bagian try
    }

}