//5.24 (Números perfeitos) Um número inteiro é dito ser um número perfeito se seus fatores, incluindo
//1 (mas não o número em si), soma ao número. Por exemplo, 6 é um número perfeito, porque 6 =
//1 + 2 + 3. Escreva um método isPerfect que determine se o parâmetro number é um número perfeito.
//Use este método em um aplicativo que exibe todos os números perfeitos entre 1 e 1000. Exibir
//os fatores de cada número perfeito para confirmar que o número é realmente perfeito. Desafie o poder de computação do seu computador
//testando números muito maiores que 1.000. Exiba os resultados.

fun main() {
    println("Números perfeitos entre 1 e 1000:")
    for (i in 1..1000) {
        if (verificaNumeroPerfeito(i)) {
            println(i)
            println("Fatores:")
            exibeDivisoresProprios(i)
            println("___________")
        }
    }
}

fun verificaNumeroPerfeito(numero: Int): Boolean {
    val resultadoDivisorProprio = somaDivisoresProprios(numero)
    return resultadoDivisorProprio == numero
}

fun somaDivisoresProprios(numero: Int): Int {
    var resultado = 0
    for (i in 1 until numero) {
        if (numero % i == 0) {
            resultado += i
        }
    }
    return resultado
}

fun exibeDivisoresProprios(numero:Int){
    for (i in 1 until numero) {
        if (numero % i == 0) {
            print(i)
            print(" ")
        }
    }
    println()
}