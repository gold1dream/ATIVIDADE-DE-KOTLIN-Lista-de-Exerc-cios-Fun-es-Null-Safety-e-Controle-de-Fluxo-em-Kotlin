fun limparBancoDeDados(emails: List<String?>) {

    var contasInvalidas = 0


    for (email in emails) {

        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Aviso: Conta com e-mail inválido detectada e marcada para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }


    println("\nTotal de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {

    val listaEmails: List<String?> = listOf(
        "ana@email.com",
        null,
        "carlos@email.com",
        "",
        "beatriz@email.com"
    )


    limparBancoDeDados(listaEmails)
}
