package `48Reflection`

data class CreateProdukRequest(
    val id: String,
    val name: String,
    val price: Long
)

data class CreateCategoryRequest(
    val id: String,
    val name: String
)