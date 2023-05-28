package `27VisibilityModifier`

class Teacher(val name: String) {
    fun teach(){
        println("Teach!")
    }
}

/**
 * public -> deafault bisa diaksesk dari mana saja
 * private -> diaakses dari tempat deklarasinya
 * protected -> diakses dari tempat deklasi dan turunannnya
 * internal -> di akses dari project yang sama
 */

fun main() {
    val teacher = Teacher("Roy")
    println(teacher.name)
    teacher.teach()
}
