package `36CompanionObject`

class Application(val name: String) {
    companion object {
        fun tuUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}