package `28ExtenionFunction`

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String){ // extension function bersifat di luar kelas jadi member private tidak bisa diakses
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }

}

fun main() {
    val student = Student("Roy", 29 )
    student.sayHello("Eko")
}