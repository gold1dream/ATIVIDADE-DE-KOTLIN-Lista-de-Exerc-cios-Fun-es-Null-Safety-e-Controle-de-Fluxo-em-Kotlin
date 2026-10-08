fun auditoriaDeEntregas(enderecos: List<String?>) {

    for (endereco in enderecos) {

        val enderecoTratado = endereco ?: "Endereço Desconhecido"

        if (enderecoTratado == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoTratado")
        }
    }
}

fun main() {
    val listaEntregas = listOf("Av. Paulista, 1000", null, "Rua das Flores, 45", null, "Praça da Sé, 20")
    auditoriaDeEntregas(listaEntregas)
}
