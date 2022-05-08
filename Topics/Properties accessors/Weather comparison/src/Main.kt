class City(val name: String) {
    var degrees: Int = 0
        set(value) {
        if (value > 57 || value < -92) {
            when(name) {

                "Dubai" -> field = 30
                "Moscow" ->  field = 5
                "Hanoi"  -> field = 20
            }
        }
        else  field = value

    }
    get(){
        return field
    }

}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    when {
        firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees -> println(firstCity.name)
        secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees -> println(secondCity.name)
        thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees -> println(thirdCity.name)
        firstCity.degrees == secondCity.degrees || secondCity.degrees == thirdCity.degrees -> println("neither")
    }
}