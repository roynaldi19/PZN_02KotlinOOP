package `38InlineClass`

inline class Token(val value: String) { // harus punya satu properties tidak kurang tidak lebih
    fun tuUpper(): String = value.toUpperCase()
}