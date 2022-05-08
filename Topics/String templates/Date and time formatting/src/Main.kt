fun main() {
    var x = readLine()?.split(" ")
    var y = readLine()?.split(" ")



    println("${x?.get(0)}:${x?.get(1)}:${x?.get(2)} " +
            "${y?.get(0)}/${y?.get(1)}/${y?.get(2)}")
}