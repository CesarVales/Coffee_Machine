import java.util.*

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");
}
fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color.lowercase(Locale.getDefault()) == enum.name.lowercase()) return true
    }
    return false
}
fun main() {
    val color = readLine()!!.lowercase().toString()
    println(isRainbow(color))
}