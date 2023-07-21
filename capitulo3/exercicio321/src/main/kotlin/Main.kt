import java.util.Scanner

/*
Proceso de encontrar o número maior

O processo de encontrar o valor maior é usado frequentemente em aplicações de computador. Por exemplo, um programa que
determina o vencedor de um concurso de vendas, informará o número de unidades vendidas por cada vendedor. O vendedor que
 vendeu o maior número de unidades vence o concurso. Escreva um programa em pseudocódigo e depois uma aplicação Java que
  insira uma série de 10 números inteiros e determine e imprima o maior número inteiro. O seu programa deve utilizar
  pelo menos as seguintes três variáveis:

a) contador: Um contador para contar até 10 (ou seja, para controlar quantos números foram inseridos e para determinar
quando todos os 10 números foram processados).
b) número: O número inteiro mais recentemente inserido pelo utilizador.
c) maior: O maior número encontrado até agora.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var contador = 1
    var maior = 0

    //Adiciona primeiro numero a variavel maior
    println("Digite o $contador")
    var numero: Int = scanner.nextInt()
    maior = numero

    //Coleta 10 numeros
    while (contador != 10) {
        println("Digite o $contador")
        var numero: Int = scanner.nextInt()
        //Verifica maior numero
        if (numero > maior) {
            maior = numero
        }
        //contador
        contador += 1
    }

    println("O maior numero é $maior")
}