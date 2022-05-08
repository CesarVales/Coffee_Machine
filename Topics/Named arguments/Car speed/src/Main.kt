fun speed(speedCar : Int,limit: Int = 60) {
    if (speedCar > limit) println("Exceeds the limit by ${speedCar-limit} kilometers per hour")
    else println("Within the limit")
}
fun main(args: Array<String>) {
    val speedCar = readLine()!!.toInt()
    when(val limit = readLine()!!.toString()) {
        "no limit" -> (speed(speedCar))
        else -> (speed(speedCar,limit.toInt()))
    }
}