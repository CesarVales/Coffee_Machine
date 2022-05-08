fun main() {
    val x = readLine()!!.toInt()
    println(
        if (x < 0) "negative" else if (x == 0) "zero" else "positive",
    )

}