import java.util.Scanner

/*
2.26 (Múltiplos) Escreva um aplicativo que leia dois números inteiros, determine se o primeiro número triplicado é um
 múltiplo do segundo número dobrado e imprima o resultado. [Dica: Use o operador resto.] */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Digite o primeiro numero")
    var numero1: Int = input.nextInt()
    println("Digite o segundo numero")
    var numero2: Int = input.nextInt()

    //Verifica se é divisivel
    if(numero1 % numero2 == 0){
        println("O $numero1 é divisivel por $numero2")
    }else{
        println("O $numero1 nao é divisivel por $numero2")
    }

}