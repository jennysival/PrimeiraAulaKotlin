//Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor
//destas variáveis. Isto é, x deve ficar com o valor de y e y deve ficar
//com o valor de x. Mostre os valores depois da troca

fun main() {
    println("Digite o valor de X:")
    var X = readln().toInt()

    println("Digite o valor de Y:")
    var Y = readln().toInt()

    var Z = X

    X = Y
    Y = Z
    Z = 0

    println("Troca de valores efetuada com sucesso. Agora X vale "+X+", e Y vale "+Y)
}