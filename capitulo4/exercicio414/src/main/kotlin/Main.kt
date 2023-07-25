/*
4.15 (Programa de Impressão de Triângulos) Escreva um aplicativo que exiba os seguintes padrões separadamente, um abaixo
do outro. Use loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na
forma de System.out.print('*');, o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma
de System.out.println(); pode ser usada para passar para a próxima linha. Uma instrução na forma de System.out.print(' ');
pode ser usada para exibir um espaço para os dois últimos padrões. Não deve haver outras instruções de saída no programa.
[Dica: Os dois últimos padrões requerem que cada linha comece com o número apropriado de espaços em branco.]
 */
fun main(args: Array<String>) {
    val asterisco = '*'
    val espaco = ' '

    // Desenha triangulo A
    //Controla altura
    for (i in 1..10) {
        // Controla as linhas
        for (j in 1..i) {
            print('*')
        }
        println()
    }
    println()

    // Desenha triangulo B
    // Controla a altura
    for (i in 10 downTo 0) {
        // Controla Linha
        for (j in 0..i) {
            print('*')
        }
        println()
    }


}