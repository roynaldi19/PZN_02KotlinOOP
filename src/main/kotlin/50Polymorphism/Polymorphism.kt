package `50Polymorphism`

fun main() {
    var employee = Employee("Roy")
    employee.sayHello("Budi")

    employee = Manager("Roy")
    employee.sayHello("Budi")

    employee = ViceManager("Roy")
    employee.sayHello("Budi")

    employee = Supervisor("Roy")
    employee.sayHello("Budi")
}