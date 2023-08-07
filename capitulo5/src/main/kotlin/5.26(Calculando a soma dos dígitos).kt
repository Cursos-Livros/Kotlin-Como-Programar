//5.26 (Calculando a soma dos dígitos) Escreva um método que receba um valor inteiro de quatro dígitos e
//retorna a soma dos dígitos. Por exemplo, dado o número 7631, o método deve retornar 17.
//Incorpore o método em um aplicativo que lê um valor do usuário e exibe o resultado.
fun main() {
    println("Digite um numero de até 4 casas")
    val numero = leInput10()
    val resultadoSoma = somaDigito(numero)
    resultadoSoma(resultadoSoma)
}

fun leInput10(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun somaDigito(numero: Int): Int {
    var numeroDigito = numero
    var resultado = 0
    while (numeroDigito != 0) {
        val digito = numeroDigito % 10 // Salva o ultimo numero
        resultado += digito
        numeroDigito /= 10 // Retira o ultimo numero
    }
    return resultado
}

fun resultadoSoma(resultado: Int) {
    println("Resultado da Soma: $resultado")
}

