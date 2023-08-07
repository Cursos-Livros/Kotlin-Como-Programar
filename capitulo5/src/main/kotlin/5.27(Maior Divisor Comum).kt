//5.27 (Maior Divisor Comum) O máximo divisor comum (MDC) de dois números inteiros é o maior
//inteiro que divide igualmente cada um dos dois números. Escreva um método gcd que retorne o maior
//divisor comum de dois números inteiros. [Dica: você pode querer usar o algoritmo de Euclides. Você pode encontrar
//informações sobre isso em en.wikipedia.org/wiki/Euclidean_algorithm.] Incorpore o método
//em um aplicativo que lê dois valores do usuário e exibe o resultado.
fun main() {
    println("Digite o 1  numero")
    var inteiro1 = leInput11()
    println("Digite o 2  numero")
    var inteiro2 = leInput11()

    val resultado = calculaMdc(inteiro1, inteiro2)

    println("MDC entre os valores:  $resultado ")
}

fun leInput11(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun calculaMdc(inteiro1: Int, inteiro2: Int): Int {
    var numeroA = inteiro1
    var numeroB = inteiro2

    while (numeroB!= 0) {
        val resto = numeroA % numeroB
        numeroA = numeroB
        numeroB = resto
    }
    return numeroA
}
