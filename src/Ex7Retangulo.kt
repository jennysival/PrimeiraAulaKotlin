//Escreva um algoritmo para ler as dimensões de um retângulo (base
//e altura), calcular e escrever a área do retângulo

fun main(){
    println("Digite a dimensão da base do retângulo:")
    val base = readln().toFloat()

    println("Digite a dimensão da altura do retângulo:")
    val altura = readln().toFloat()

    val area = base*altura

    println("A área do retângulo é: "+area)
}