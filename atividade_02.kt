fun main(){
    println("Digite um numero que você queira ver a tabuada de multiplicação")
    println("--> ")
    var numero:Int = readln().toInt()
    var lista:Int = 11
    println()
    println("-----TABUADA-----")

    while(lista > 0){
        lista--
        var multiplicacao:Int = numero * lista
        println("  $numero X $lista = $multiplicacao ")
    }

}