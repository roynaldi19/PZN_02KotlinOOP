package `07SecondaryConstructor`

class Car(brandParam: String, nameParam: String, yearParam: Int) {

    init {
        println("Car $brandParam dibuat")
    }

    constructor(brandParam: String, nameParam: String) : this(brandParam, nameParam, 2020) {
        println("Secondary Construktor 1")
    }

    constructor(brandParam: String) : this(brandParam, "") {
        println("Secondary Construktor 2")
    }

    var brand: String = brandParam
    var name: String = nameParam
    var year: Int = yearParam

}