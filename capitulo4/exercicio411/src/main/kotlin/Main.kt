import java.util.Scanner

/*
4.11 (Extremos) Escreva um aplicativo que encontre o valor mínimo e máximo entre vários números inteiros e, em seguida,
calcule a soma dos dois extremos. O usuário será solicitado a inserir quantos valores o aplicativo deve pedir para que
ele insira.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var numero: Int = 0
    var quantidadeValores: Int = 0
    var maior = 0
    var menor = 0

    println("Digite quantos valores serão necessários:")
    quantidadeValores = scanner.nextInt()

    println("Digite um valor")
    numero = scanner.nextInt()

    maior = numero
    menor = numero

    // Verifica o menor valr e o valor maximo
    for (i in 1..< quantidadeValores) {
        println("Digite um valor")
        numero = scanner.nextInt()

        if (numero > maior) {
            maior = numero
        } else if (numero < menor) {
            menor = numero
        }
    }

    println("Maior numero $maior Menor numero $menor")
}