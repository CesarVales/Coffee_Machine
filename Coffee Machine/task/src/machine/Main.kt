package machine

enum class coffeeType(val visibleName: String, val water: Int, val milk: Int, val beans: Int, val price: Int) {
    ESPRESSO("espresso", 250, 0, 16, 4),
    LATTE("latte", 350, 75, 20, 7),
    CAPPUCCINO("cappuccino", 200, 100, 12, 6),
}

class coffeeMachine(var water: Int, var milk: Int, var beans: Int, var cups: Int, var money: Int) {

    fun status(): String{
        return "The coffee machine has:\n" +
                "$water of water\n" +
                "$milk of milk\n" +
                "$beans of coffee beans\n" +
                "$cups of disposable cups\n" +
                "$money of money"
    }
    fun buy(type: coffeeType) {
        when {
            water < type.water ->  "Sorry, not enough water!"
            milk < type.milk -> "Sorry, not enough milk!"
            beans < type.beans -> "Sorry, not enough coffee beans!"
            cups < 1 -> "Sorry, not enough disposable cups!"

            else -> {
                water -= type.water
                milk -= type.milk
                beans -= type.beans
                cups--
                money += type.price
                "I have enough resources, making you a coffee!"
            }
        }

    }
}
fun main() {
    }


