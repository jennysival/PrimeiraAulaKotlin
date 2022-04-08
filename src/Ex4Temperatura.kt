//Crie um algoritmo que, dada uma temperatura em graus célsius,
//exiba uma mensagem informando o tipo do clima, de acordo com as
//seguintes condições:
//a. se a temperatura estiver até 18 graus, o clima é frio;
//b. se a temperatura estiver entre 19 e 23 graus, o clima é
//agradável;
//c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
//d. se a temperatura estiver acima de 35 graus, o clima é muito
//quente

fun main(){
    println("Informe a temperatura (ºC):")
    val temp = readln().toInt()

    if(temp <= 18){
        println("O clima está frio")
    }
    else if(temp >= 19 && temp <= 23){
        println("O clima está agradável :)")
    }
    else if(temp >= 24 && temp <= 35){
        println("O clima está quente")
    }
    else{
        println("O clima está muito quente")
    }
}