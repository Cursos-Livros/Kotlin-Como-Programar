import java.util.Scanner

/*
3.23 (Encontrar os Dois Maiores Números) Utilizando uma abordagem similar à do Exercício 3.21, encontre os dois maiores
valores entre os 10 valores inseridos. [Observação: Você só pode inserir cada número uma vez.]
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var contador = 1
    var maior = 0
    var maior2 = 0
    var repetido = 0

    //Adiciona primeiro numero a variavel maior
    println("Digite o $contador")
    var numero: Int = scanner.nextInt()
    maior = numero
    repetido = numero

    //Coleta 10 numeros
    while (contador != 10) {
        println("Digite o $contador")
        var numero: Int = scanner.nextInt()

        //verifica repetido
        if(numero == repetido){
            println("Esse numero ja foi, digite outro")
        }

        //Verifica maior numero e segundo maior
        if (numero > maior) {
            maior2 = maior
            maior = numero
        }
        //contador
        contador += 1
    }

    println("O maior numero é $maior")
    println("O segundo maior numero é $maior2")
}