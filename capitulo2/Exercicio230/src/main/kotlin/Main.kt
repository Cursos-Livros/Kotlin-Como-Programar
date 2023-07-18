import java.util.Scanner

/*
2.30 (Separando os Dígitos de um Número Inteiro) Escreva um aplicativo que solicita ao usuário um número consistindo de
 cinco dígitos, separa o número em seus dígitos individuais e imprime os dígitos separados um do outro por três espaços
  cada. Por exemplo, se o usuário digitar o número 42339, o programa deve imprimir:

  4   2   3   3   9

Suponha que o usuário insira o número correto de dígitos. O que acontece quando você insere um número com mais de cinco
dígitos? E quando você insere um número com menos de cinco dígitos? [Dica: É possível fazer este exercício com as
técnicas que você aprendeu neste capítulo. Você precisará usar operações de divisão e resto para "separar" cada dígito.]
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Digite um numero de até 5 digitos")
    var numero: Int = input.nextInt()

    //Separar numero
    var quintoDigito = numero % 10
    numero = numero / 10
    var quartoDigito = numero % 10
    numero = numero / 10
    var terceiroDigito = numero % 10
    numero = numero / 10
    var segundoDigito = numero % 10
    numero = numero / 10
    var primeiroDigito = numero % 10
    numero = numero / 10



    println("$primeiroDigito" + " $segundoDigito" + " $terceiroDigito" + " $quartoDigito" + " $quintoDigito")



}