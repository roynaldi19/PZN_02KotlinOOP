package `33AnonymousClass`

fun fireAction(action: Action) {
    action.action()
}


fun main() {
    fireAction(object : Action { //anonim class
        override fun action() {
            println("action one")
        }
    })
    fireAction(object : Action {
        override fun action() = println("action two")
    })

}