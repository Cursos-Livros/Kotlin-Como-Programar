//5.29 (Jogo de uma moeda) Escreva um aplicativo que simule o lançamento de uma moeda. Deixe o programa jogar uma moeda
//cada vez que o usuário escolhe a opção de menu “Toss Coin”. Conte quantas vezes cada lado da
//a moeda aparece. Exiba os resultados. O programa deve chamar um flip de método separado que não
//argumentos e retorna um valor de uma enumeração Coin (HEADS e TAILS). [Nota: Se o programa realisticamente
//simula o lançamento de uma moeda, cada lado da moeda deve aparecer aproximadamente na metade do tempo.]
import kotlin.random.Random

enum class Moeda {
    Cara,
    Coroa
}

fun main() {
    val numeroJogadas = 10
    for (i in 1..numeroJogadas) {
        val resultado = jogarMoeda()
        println("Cara ou coroa $i: $resultado")
    }
}

fun jogarMoeda(): Moeda {
    val valorRandom = Random.nextInt(2)
    return if (valorRandom == 0) Moeda.Cara else Moeda.Coroa
}