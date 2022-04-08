//Crie um algoritmo que receba do usuário um número
// qualquer e verifique se esse é múltiplo de 5
fun main(){
    println("Digite um número: ")
    val numDig = readln().toInt()

    if(numDig % 5 == 0){
        println("O número "+numDig+" é múltiplo de 5")
    }
    else{
        println("O número "+numDig+" não é múltiplo de 5")
    }
}