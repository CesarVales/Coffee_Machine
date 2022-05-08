object Math {
    fun abs(valor: Int) :Int {
        return if (valor < 0) -valor else valor
    }
    fun abs(valor: Double) : Double {
        return  if (valor < 0.0 ) -valor else valor
    }
}