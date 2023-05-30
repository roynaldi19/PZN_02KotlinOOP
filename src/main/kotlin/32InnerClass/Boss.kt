package `32InnerClass`

class Boss(val bossName: String) {

    inner class Employee(val employeeName: String) {
        fun hi() {
            println("Hi, my name is $employeeName, my boss name is ${this@Boss.bossName}") //label digunakan untuk mengakses atribut outer class
        }
    }
}

fun main() {
    val boss = Boss("Eko")
    val employee = boss.Employee("Roynaldi")
    employee.hi()
}