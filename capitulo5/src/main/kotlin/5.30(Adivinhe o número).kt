import kotlin.random.Random

//5.30 (Adivinhe o número) Escreva um aplicativo que reproduza “adivinhe o número” da seguinte maneira:
//programa escolhe o número a ser adivinhado selecionando um número inteiro aleatório no intervalo de 1 a 1000.
//O aplicativo exibe o prompt Adivinhe um número entre 1 e 1000. O jogador insere um primeiro
//adivinhar. Se o palpite do jogador estiver incorreto, seu programa deve exibir Muito alto. Tente novamente. ou também
//baixo. Tente novamente. para ajudar o jogador a "zerar" a resposta correta. O programa deve solicitar ao
//usuário para o próximo palpite. Quando o usuário insere a resposta correta, exibe Parabéns. Você adivinhou o número! e permite que o usuário escolha se quer jogar novamente.
//[Nota: A técnica de adivinhação empregada neste problema é semelhante a uma pesquisa binária, que é discutida no Capítulo 19,
//Pesquisando, Classificando e Big O.]

fun main() {
    val numeroSorteado = sorteiaNumero()
    println(numeroSorteado)

    var palpite = lePalpite()
    var status = verificaAcerto(numeroSorteado, palpite)

    while (!status) {
        verificaErro(numeroSorteado, palpite)
        println("Você errou digite novamente")
        palpite = lePalpite()
        status = verificaAcerto(numeroSorteado, palpite)
    }
}

fun sorteiaNumero(): Int {
    val valorRandom = Random.nextInt(1000)
    return valorRandom
}

fun lePalpite(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun verificaAcerto(numeroSorteado: Int, palpite: Int): Boolean {
    if (numeroSorteado == palpite) {
        println("Você acertou")
    }
    return numeroSorteado == palpite
}

fun verificaErro(numeroSorteado: Int, palpite: Int) {
    if (palpite > numeroSorteado) {
        println("O numero é maior")
    } else {
        println("O numero é menor")
    }
}

