package `05Constructor`

class Car(brandParam: String, soldParam: String?, yearParam: String = "2020") {
    var brand: String = brandParam
    var sold: String? = soldParam
    var year: String = yearParam

}