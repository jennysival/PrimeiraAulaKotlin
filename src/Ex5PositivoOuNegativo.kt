//Crie um algoritmo que leia um número do usuário e informe se e o
//número é positivo ou negativo

fun main(){
    println("Digite um número:")
    val numero = readln().toInt()

    if(numero < 0 ){
        println("O número é negativo")
    }
    else{
        println("O número é positivo")
    }
}