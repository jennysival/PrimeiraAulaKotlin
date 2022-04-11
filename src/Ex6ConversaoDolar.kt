//Crie um algoritmo que lê um valor real em dólar, e converte o valor
//para reais. Considere a cotação do dolar atual

fun main(){
    val cotacao = 4.75f

    println("Digite quantos dólares(US$) deseja converter:")
    val dolar = readln().toFloat()

    val real = dolar*cotacao

    println("Você acabou de converter US$$dolar em R$$real")
}