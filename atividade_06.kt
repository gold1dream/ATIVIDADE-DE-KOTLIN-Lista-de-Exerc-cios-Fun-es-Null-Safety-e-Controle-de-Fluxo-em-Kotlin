fun main() {

    val calcularGorjeta: (Double?) -> Double = {

        if (it == null || it < 0) {
            0.0
        } else {
            it
        }
    }

    val gorjetaNula = calcularGorjeta(null)
    val gorjetaNegativa = calcularGorjeta(-5.5)
    val gorjetaValida = calcularGorjeta(15.0)

    println("Gorjeta Nula: R$ $gorjetaNula")       // Deve retornar 0.0
    println("Gorjeta Negativa: R$ $gorjetaNegativa") // Deve retornar 0.0
    println("Gorjeta Válida: R$ $gorjetaValida")     // Deve retornar 15.0
