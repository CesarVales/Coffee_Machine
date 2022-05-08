enum class game(val country: String, val currency: String) {
    Germany("Germany","Euro"),
    Mali("Mali","CPA franc"),
    Dominica("Dominica","Eastern Caribbean dollar"),
    Canada("Canada","Canadian dollar"),
    Spain("Spain","Euro"),
    Australia("Australia","Australian dollar"),
    Brazil("Brazil","Brazilian real"),
    Senegal("Senegal","CPA franc"),
    France("France","Euro"),
    Grenada("Grenada","Eastern Caribbean dollar"),
    Kiribati("Kiribati","Australian dollar");
    companion object {
        fun isInEnum(nome: String): Boolean{
            for (enum in values() ) {
                if (nome == enum.country) return true
            }
            return false
        }
    }

}

fun main() {

    var nome = readLine()!!.split(" ")
    if (game.isInEnum(nome[0]) && game.isInEnum(nome[1])) {
        val pais1 = game.valueOf(nome[0]).currency
        val pais2 = game.valueOf(nome[1]).currency
        println(pais1 == pais2)
    }else println(false)






}