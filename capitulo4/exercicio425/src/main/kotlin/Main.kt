import java.util.Scanner

/*
4.25 (Modified Diamond Printing Program) Modifique a aplicação que você escreveu no Exercício 4.24
para ler um número ímpar no intervalo de 1 a 19 para especificar o número de linhas no losango. Seu
o programa deve exibir um losango do tamanho apropriado.
 */
fun main(args: Array<String>) {
    val alturaTriangulo = 5 // Altere a altura do triângulo aqui

    for (linha in 1..alturaTriangulo) {
        // Imprime espaços em branco antes dos caracteres do triângulo
        for (espaco in 1..alturaTriangulo - linha) {
            print(" ")
        }

        // Imprime os caracteres do triângulo
        for (caractere in 1..2 * linha - 1) {
            print("*")
        }

        // Quebra a linha para a próxima linha do triângulo
        println()

    }

    for (linha in alturaTriangulo downTo  1) {
        // Imprime espaços em branco antes dos caracteres do triângulo
        for (espaco in alturaTriangulo - linha downTo 1) {
            print(" ")
        }

        // Imprime os caracteres do triângulo
        for (caractere in 2 * linha - 1 downTo 1) {
            print("*")
        }

        // Quebra a linha para a próxima linha do triângulo
        println()

    }

}