//5.23 (Números palíndromos) Um número inteiro positivo é um palíndromo se seu valor for o mesmo depois de inverter
//a ordem dos dígitos no número. Por exemplo, 12321 é um palíndromo, mas 12563 não é.
//Escreva um método que determine se um número é um palíndromo. Use este método em um aplicativo que determina se um
//número digitado pelo usuário é um palíndromo ou não e imprime oresultado para o console.

fun main() {
    println("Digite um número de até 5 dígitos:")
    val numero = leInput9()

    testaIntervaloNumero(numero)
    var palindromo = 0

    when (testaIntervaloNumero(numero)) {
        true -> palindromo = verificaDigito(numero)
        false -> intervaloErrado()
    }

    verificaPalindromo(numero, palindromo)
}

fun leInput9(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun testaIntervaloNumero(numero: Int): Boolean {
    val teste = numero > 0 && numero < 99999
    return teste
}

fun verificaDigito(numero: Int): Int {
    var numeroDigito = numero
    var resultado = 0
    while (numeroDigito != 0) {
        val digito = numeroDigito % 10 // Salva o ultimo numero
        resultado = resultado * 10 + digito
        numeroDigito /= 10 // Retira o ultimo numero
    }
    return resultado
}

fun intervaloErrado() {
    println("O numero nao esta entre 0 e 99999")
}

fun verificaPalindromo(numero: Int, palindromo: Int) {
    if (numero == palindromo) {
        println("É um palíndromo")
    } else {
        println("Não é palíndromo")
    }
}