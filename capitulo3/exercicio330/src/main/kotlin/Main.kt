import java.util.Scanner

/*
3.30 (Triângulo Retângulo) Escreva um aplicativo que solicita ao usuário que digite o comprimento da base de um
triângulo e, com isso, desenhe um triângulo retângulo composto por asteriscos. Seu programa deve funcionar para
triângulos com comprimentos de base entre 1 e 10.
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var contador = 1
    val asterisco = '*'

    println("Digite a base do triângulo (entre 1 e 10):")
    var base: Int = scanner.nextInt()

    //Verifica base
    if (base in 1..10) {
        while (contador <= 10) {
            var i =1
            //Imprime asterisco
            while(i <= contador){
                print("$asterisco")
                i += 1
            }
            println()
            contador += 1
        }
    }
}