 class Player(val id: Int, val name: String, val hp: Int){
    companion object {
        val hp = 100

        fun create(name: String): Player {
            val jogador = Player(kotlin.random.Random.nextInt(),name, hp)
            return jogador
        }
    }
}
