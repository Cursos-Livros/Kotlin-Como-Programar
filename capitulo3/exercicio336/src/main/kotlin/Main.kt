import java.util.Scanner

/*
3.36 (Criando um Comparador) Escreva um aplicativo que funcione como um comparador. Seu programa deve ler dois números
do usuário e imprimir 0 se eles forem iguais, 1 se o primeiro número for maior e -1 se o segundo número for maior.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var numero1: Int = 0
    var numero2: Int = 0

    println("Digite o 1 numero")
    numero1 = scanner.nextInt()
    println("Digite o 2 numero")
    numero2 = scanner.nextInt()
        
    val teste = numero1 > numero2

    println(teste)

}