import java.util.Scanner

/*
3.32 (Imprimindo o Equivalente Decimal de um Número Binário) Escreva um aplicativo que insere um número inteiro contendo
apenas 0s e 1s (ou seja, um inteiro binário) e imprime seu equivalente decimal. [Dica: Use os operadores de resto e
divisão para extrair os dígitos do número binário, um por vez, da direita para a esquerda. No sistema de numeração
decimal, o dígito mais à direita tem um valor posicional de 1 e o próximo dígito à esquerda tem um valor posicional de
10, depois 100, depois 1000 e assim por diante. O número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100.
No sistema de numeração binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito à esquerda tem
um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal do binário 1101 é 1 * 1 + 0 * 2
+ 1 * 4 + 1 * 8, ou 1 + 0 + 4 + 8, ou 13.]
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Digite o numero binário")
    var numero: Int = scanner.nextInt()

    var numeroDecimal = 0
    var posicao = 1


    while (numero != 0) {
        val digito = numero % 10 //Salva um digito, digito ja vem ao contrario
        if (digito != 0 && digito != 1) {
            println("Erro: O número deve conter apenas 0s e 1s.")
            return
        }
        numeroDecimal += digito * posicao //Multiplica esse digito por 2
        posicao *= 2
        numero /= 10
    }

    println("Número Decimal Equivalente: $numeroDecimal")
}