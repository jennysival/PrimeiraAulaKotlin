//Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu

fun main(){
    println("Qual a sua idade?")
    val idade = readln().toInt()

    val dias = idade*365

    println("Você já viveu "+dias+" dias!")
}