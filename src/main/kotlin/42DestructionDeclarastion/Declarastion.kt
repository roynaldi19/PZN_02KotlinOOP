package `42DestructionDeclarastion`

fun main() {
    val game = Game("Harvest Moon Back to Nature", 28_000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)

}