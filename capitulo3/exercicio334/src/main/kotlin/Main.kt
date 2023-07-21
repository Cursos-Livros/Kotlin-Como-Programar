import java.util.Scanner

/*
3.34 (Lendo números até uma soma especificada) Escreva um aplicativo que solicita um número ao usuário e, em seguida,
continua lendo valores inteiros do usuário até que a soma desses inteiros seja igual ou maior que o valor que foi
inicialmente fornecido pelo usuário.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var numeroOriginal = 0
    var soma = 0

    println("Digite um numero:")
    var numero: Int = scanner.nextInt()

    numeroOriginal = numero

    //Calcula a soma
    while (soma < numeroOriginal) {
        println("Digite novamente um numero:")
        numero = scanner.nextInt()
        soma += numero
    }

    println("O $numero é maior ou igual ao $numeroOriginal")
}