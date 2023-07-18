import java.util.Scanner

/*
2.29 (Valor Inteiro de um Caractere)

Aqui está uma prévia adicional. Neste capítulo, você aprendeu sobre inteiros e o tipo int. Kotlin também pode representar
letras maiúsculas, letras minúsculas e uma variedade considerável de símbolos especiais. Cada caractere tem uma
correspondente representação inteira. O conjunto de caracteres que um computador utiliza, juntamente com as
correspondentes representações inteiras para esses caracteres, é chamado de conjunto de caracteres do computador.
Você pode indicar o valor de um caractere em um programa simplesmente envolvendo esse caractere em aspas simples,
como em 'A'.

Você pode determinar o equivalente inteiro de um caractere precedendo esse caractere com (int), como em (int) 'A'.

Um operador nesta forma é chamado de operador de conversão (cast operator). (Você aprenderá sobre operadores de conversão no Capítulo 3.)

A seguinte instrução imprime um caractere e seu equivalente inteiro:

Usando instruções semelhantes à mostrada anteriormente neste exercício, escreva um aplicativo que exiba os
equivalentes inteiros de algumas letras maiúsculas, letras minúsculas, dígitos e símbolos especiais.
Exiba os equivalentes inteiros dos seguintes caracteres: A B C a b c 0 1 2 $ * + / e o caractere em branco.
 */
fun main(args: Array<String>) {
    println("Digite o caractere:")
    var character = readLine()
    var unicodeCharacter = character?.get(0)?.code

    println("O Unicode do caractere $character é $unicodeCharacter")
}