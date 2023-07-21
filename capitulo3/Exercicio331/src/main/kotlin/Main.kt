import java.util.Scanner

/*
3.31 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da mesma forma de trás para frente. Por
exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um
aplicativo que leia um inteiro de cinco dígitos e determine se é um palíndromo. Se o número não tiver cinco dígitos,
exiba uma mensagem de erro e permita que o usuário insira um novo valor.
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var numero: Int = 0
    var resultado = 0
    var numeroOriginal = 0

    println("Digite um número de até 5 dígitos:")
    numero = scanner.nextInt()

    if (numero in 0..99999) {
        // Verificar se é um palíndromo
        numeroOriginal = numero // Salvamos o número original
        while (numero != 0) {
            val digito = numero % 10 // Salva o ultimo numero
            resultado = resultado * 10 + digito
            numero /= 10 // Retira o ultimo numero
        }
    } else {
        println("O numero nao esta entre 0 e 99999")
        numero = scanner.nextInt()
        while (numero < 0 && numero > 99999) {
            numero = scanner.nextInt()
        }
    }

    if (resultado == numeroOriginal) {
        println("É um palíndromo")
    } else {
        println("Não é palíndromo")
    }

}