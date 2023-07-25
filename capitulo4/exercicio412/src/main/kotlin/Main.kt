/*
4.12 (Inteiros Divisíveis por 3) Escreva um aplicativo que calcule a soma dos números inteiros entre 1 e 30 que são
divisíveis por 3.
 */
fun main(args: Array<String>) {
    var soma = 0

    // soma de 0 a 30
    for (i in 0..30) {
        // Soma somente numeros divisiveis por i
        if (i % 3 == 0) {
            soma += i
        }
    }

    println(soma)
}