//5.16 (Múltiplos) Escreva um método isMultiple que determine, para um par de inteiros, se o
//segundo inteiro é um múltiplo do primeiro. O método deve receber dois argumentos inteiros e retornar
//true se o segundo for um múltiplo do primeiro e false caso contrário. [Dica: Use o operador resto.]
//Incorpore este método em um aplicativo que insere uma série de pares de números inteiros (um par em um
//tempo) e determina se o segundo valor em cada par é um múltiplo do primeiro.
fun main() {
    println("Digite o 1  numero")
    var par1 = leInput3()
    println("Digite o 2  numero")
    var par2 = leInput3()

    if (testaMultiplo(par1, par2)) {
        println("O numero $par1 é divisivel pelo numero $par2")
    } else {
        println("O numero $par1 nao é divisivel pelo numero $par2")
    }
}

fun leInput3(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun testaMultiplo(par1: Int, par2: Int): Boolean {
    val teste = par1 % par2 == 0
    return teste
}
