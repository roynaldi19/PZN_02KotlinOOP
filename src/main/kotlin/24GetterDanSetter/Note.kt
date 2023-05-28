package `24GetterDanSetter`

class Note(title: String) {
    var title: String = title
        get() {
            return field
        }
        set(value) {
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Invalid Title")
            }
        }
}

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = "Ngantuk"
    println(note.title)

}