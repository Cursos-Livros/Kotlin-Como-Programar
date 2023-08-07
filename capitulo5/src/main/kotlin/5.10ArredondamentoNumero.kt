
import kotlin.math.round

//5.10 (Arredondamento de números) Para arredondar números para casas decimais específicas, use uma instrução como
//duplo y = Math.floor(x * 10 + 0,5) / 10;
//que arredonda x para a décima posição (isto é, a primeira posição à direita da vírgula) ou
//duplo y = Math.floor(x * 100 + 0,5) / 100;
//que arredonda x para a casa dos centésimos (ou seja, a segunda posição à direita da casa decimal
//apontar). Escreva um aplicativo que defina quatro métodos para arredondar um número x de várias maneiras:
//a) roundToInteger(número)
//b) roundToDecimos(número)
//c) roundToHundredths(número)
//d) roundToThousandths(number)
//Para cada valor lido, seu programa deve exibir o valor original, o número arredondado para o
//inteiro mais próximo, o número arredondado para o décimo mais próximo, o número arredondado para o centésimo mais próximo
// e o número arredondado para o milésimo mais próximo.
fun main() {
    val numero = leNumero()
    val inteiro = arredondaInteiro(numero)
    val decimos = arredondaDecimos(inteiro)
    val centesimos = arredondaCentesimos(inteiro)
    val milesimos = arredondaMilesimos(inteiro)

    println("Numero Inteiro $inteiro")
    println("Numero decimal $decimos")
    println("Numero centesimal $centesimos")
    println("Numero milesimos $milesimos")
}

fun leNumero(): Double {
    println("Digite um numero")
    val input = readLine() ?: "0"
    val numero = input.toDouble()
    return numero
}

fun arredondaInteiro(numero: Double): Int {
    val numeroInteiro = round(numero).toInt()
    return numeroInteiro
}

fun arredondaDecimos(numero: Int): Double {
    val numeroDecimos = round(numero.toDouble() / 10)
    return numeroDecimos
}

fun arredondaCentesimos(numero: Int): Double {
    val numeroCentesimos = numero.toDouble() / 100
    return numeroCentesimos
}

fun arredondaMilesimos(numero: Int): Double {
    val numeroMilesimos = numero.toDouble() / 1000
    return numeroMilesimos
}


