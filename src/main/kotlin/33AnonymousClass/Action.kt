package `33AnonymousClass`

//mmembuat kelas dari kelas yng belum lengkap seperti abstac dan interface
interface Action {
    fun action()
}

fun fireAction(action: Action) {
    action.action()
}


fun main() {
    fireAction(object : Action { //anonim class yang di delarasikan di dalam function
        override fun action() {
            println("action one")
        }
    })
    fireAction(object : Action {
        override fun action() = println("action two")
    })

}