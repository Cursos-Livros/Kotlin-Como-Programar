//5.18 (Exibindo um quadrado de asteriscos) Escreva um método squareOfAsterisks que exibe um sólido
//quadrado (o mesmo número de linhas e colunas) de asteriscos cujo lado é especificado no parâmetro
//inteiro lado. Por exemplo, se o lado for 4, o método deve exibir
//Incorpore esse método em um aplicativo que lê um valor inteiro para o lado do usuário e
//gera os asteriscos com o método squareOfAsterisks.
fun main() {
    println("Digite o numero de lados")
    var lados = leInput4()

    desenhaQuadrados(lados)
}

fun leInput4(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun desenhaQuadrados(lados: Int) {
    for (altura in 1..lados) {
        for (linha in 1..lados) {
            print("* ")
        }
        println()
    }
}