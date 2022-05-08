enum class Rainbow(val Color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}
fun main() {
    val color = readLine()!!
    println(Rainbow.valueOf(color.uppercase()).ordinal+1)
}