package `17AnyClass`


open class HandPhone(val name: String)

class SmartPhone(name: String, val os:String): HandPhone(name)

fun main() {
    val smartPhone = SmartPhone("xiomy", "Android 11")
    println(smartPhone.toString())
    println(smartPhone.hashCode())

}