
import java.util.Scanner
/*
2.24 (Maiores e Menores Inteiros) Escreva um aplicativo que leia cinco inteiros e determine
e imprime os maiores e menores inteiros do grupo. Use apenas as técnicas de programação que você
aprendido neste capítulo.
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    //Le os cinco numeros
    println("Digite o numero 1")
    var numero1: Int = input.nextInt()
    println("Digite o numero 2")
    var numero2: Int = input.nextInt()
    println("Digite o numero 3")
    var numero3: Int = input.nextInt()
    println("Digite o numero 4")
    var numero4: Int = input.nextInt()
    println("Digite o numero 5")
    var numero5: Int = input.nextInt()

    //calcula o menor numero
    if(numero1 < numero2 && numero1 < numero3 && numero1 < numero4 && numero1 < numero5){
        println("1 é o menor")
    }
    if(numero2 < numero1 && numero2 < numero3 && numero2 < numero4 && numero2 < numero5){
        println("2 é o menor")
    }
    if(numero3 < numero1 && numero3 < numero2 && numero3 < numero4 && numero3 < numero5){
        println("3 é o menor")
    }
    if(numero4 < numero1 && numero4 < numero2 && numero4 < numero3 && numero4 < numero5){
        println("4 é o menor")
    }
    if(numero5 < numero1 && numero5 < numero2 && numero5 < numero3 && numero5 < numero4){
        println("5 é o menor")
    }

    //calcula o maior numero
    if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5){
        println("1 é o maior")
    }
    if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5){
        println("2 é o maior")
    }
    if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5){
        println("3 é o maior")
    }
    if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5){
        println("4 é o maior")
    }
    if(numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4){
        println("5 é o maior")
    }

}