fun main() {
    val year = readLine()!!.toInt()
    if(year >= 1900 && year <= 3000){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            println("Leap")
        }else {
            println("Regular")
        } 
    }
    else{
        println("Invalid Year!!")
    }
}
