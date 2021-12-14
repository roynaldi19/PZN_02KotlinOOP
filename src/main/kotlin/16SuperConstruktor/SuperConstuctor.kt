package `16SuperConstruktor`

fun main() {
    val premiumCustomer = PremiumCustomer("Roynaldi")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Kidd", 1_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}