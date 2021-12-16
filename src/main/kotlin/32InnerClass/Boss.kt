package `32InnerClass`

class Boss(val bossName: String) {

    inner class Employee(val name: String) {
        fun hi() {
            println("Hi, my name is $name, my boss name is ${this@Boss.bossName}")
        }
    }
}