import java.util.Scanner

/*
2.25 (Divisível por 3) Escreva um aplicativo que leia um inteiro e determine e imprima
se é divisível por 3 ou não. [Dica: Use o operador resto. Um número é divisível por 3 se
é dividido por 3 com resto 0.]
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Digite um numero inteiro")
    var numero: Int = input.nextInt()

    if(numero % 3 == 0){
     println("$numero é divisivel por 3")
    }else{
     println("Não é divisivel por 3")
    }
}