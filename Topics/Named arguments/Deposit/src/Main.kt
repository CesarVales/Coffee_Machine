import kotlin.math.pow

fun main() {
    fun interest(amount :Int = 1000 ,percent :Int = 5 ,years :Int = 10){
        val compoundInterest = (amount.toDouble() * (1 + percent.toDouble() / 100.00).pow(years.toDouble())).toInt()
        println(compoundInterest)
    }

    when(readLine()!!.toString()) {
        "amount" -> interest(amount = readLine()!!.toInt())
        "percent" -> interest(percent = readLine()!!.toInt())
        "years" -> interest(years = readLine()!!.toInt())
    }

}