//Crie um algoritmo que leia um número inteiro e mostre seu antecessor
fun main(){
    println("Digite um número:")
    val numero = readln().toInt()

    val resultado = numero-1

    println("O antecessor de "+numero+" é: "+resultado)
}