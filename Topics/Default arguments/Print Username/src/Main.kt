fun main() {
    var name = readLine()!!.toString()
    if(name =="HIDDEN") {
        println("Hello, secret user!")
    } else {
        println("Hello, $name!")
    }
}
