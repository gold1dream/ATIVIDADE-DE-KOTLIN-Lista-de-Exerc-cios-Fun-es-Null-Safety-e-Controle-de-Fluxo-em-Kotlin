fun main() {
val carrinho = listOf("Camiseta", "Calça", "Tênis", "Boné")

    for(i in carrinho){
        println("Item no carrinho: $i")
        Thread.sleep(1000)
    }
}