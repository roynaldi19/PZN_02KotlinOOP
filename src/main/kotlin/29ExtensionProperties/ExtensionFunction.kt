package `29ExtensionProperties`

fun main() {
    val student :Student? = Student("Roy", 29 )
    student.sayHello("Eko")
    println(student?.upperName)
}