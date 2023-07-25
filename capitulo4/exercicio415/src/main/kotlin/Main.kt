import java.util.Scanner

/*
4.16 (Programa de Impressão de Gráfico de Barras) Uma aplicação interessante de computadores é exibir
gráficos e gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada
número lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se o programa ler o número
7, ele deve exibir ******* (sete asteriscos). Exiba as barras de asteriscos após
ler todos os cinco números.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var numero = 0

    for (i in 1..5) {
        println("Digite um numero")
        numero = scanner.nextInt()

        for (j in 1..numero) {
            print("*")
        }
        println()
    }


}