/*
Um tabuleiro de damas é uma grade 8x8 com quadrados alternados preenchidos com asteriscos ('*') e espaços em branco ('
 '). O padrão tem a seguinte aparência:
 * * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
As linhas pares começam com um asterisco, enquanto as linhas ímpares começam com um espaço em branco. Em cada linha, os
asteriscos e espaços em branco se alternam.

Esse padrão é criado usando iterações em duas dimensões (linhas e colunas) e verificando se o índice da linha e o índice
da coluna são ambos pares ou ambos ímpares. Se sim, colocamos um asterisco ('*'), caso contrário, colocamos um espaço
em branco (' '). O resultado é um tabuleiro de damas com padrão de asteriscos.
 */
fun main(args: Array<String>) {
    val asterisco = '*'
    val espaco = ' '
    var contadorColuna = 0
    var contadorLinha = 0

    // Imprime a coluna
    while (contadorLinha < 8) {
        // Adiciona espaços
        if (contadorLinha % 2 == 1) {
            print("$espaco")
        }
        //Imprime a linha
        while (contadorColuna < 8) {
            print("$asterisco")
            print("$espaco")
            contadorColuna += 1
        }
        println()
        contadorColuna = 0
        contadorLinha += 1
    }
}