import java.util.Scanner

/*
2.17 (Aritmética, Menor e Maior) Escreva um aplicativo que receba três inteiros da
usuário e exibe a soma, média, produto, menor e maior dos números. Use as técnicas
mostrado na Fig. 2.15. [Nota: O cálculo da média neste exercício deve resultar em um número inteiro
representação da média. Então, se a soma dos valores for 7, a média deve ser 2, não 2,3333….]
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var soma = 0
    var media = 0.0
    var produto = 0
    var menor = false
    var maior = false

    println("Digite o numero 1")
    var numero1: Int = input.nextInt()
    println("Digite o numero 2")
    var numero2: Int = input.nextInt()
    println("Digite o numero 3")
    var numero3: Int = input.nextInt()

    soma = (numero1 + numero2 + numero3)
    media = soma / 3.0
    produto = (numero1 * numero2 * numero3)

    println("Soma: $soma")
    println("Media $media")
    println("Produto: $produto")

    //calcula o maior numero
    if (numero1 > numero2 && numero1 > numero3){
        println("Numero 1 é o maior")
    }
    if(numero2 > numero1 && numero2 > numero3){
        println("Numero 2 é o maior")
    }
    if(numero3 > numero2 && numero3 > numero1){
        println("Numero 3 é o maior")
    }

    //calcula o menor numero
    if (numero1 < numero2 && numero1 < numero3){
        println("Numero 1 é o menor")
    }
    if(numero2 < numero1 && numero2 < numero3){
        println("Numero 2 é o menor")
    }
    if(numero3 < numero2 && numero3 < numero1){
        println("Numero 3 é o menor")
    }
}