package `06InitializerBlock`

class Car(brandParam: String, soldParam: String?, yearParam: String = "2000" ) {

    init {
        println("kode program ini di eksekusi setiap ada objek di buat dari kelas ini, ini dieksekusi pada objek $brandParam")
    }

    var brand: String = brandParam
    var sold: String? = soldParam
    var year: String = yearParam

}