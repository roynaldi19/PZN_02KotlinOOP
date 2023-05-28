package `29ExtensionProperties`

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

val Student.upperName: String
    get() = this.name.toUpperCase()

fun main() {
    val student :Student? = Student("Roy", 29 )
    student.sayHello("Eko")
    println(student?.upperName)
}