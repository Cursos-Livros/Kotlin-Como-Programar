/*
2.34 (Calculadora de Crescimento Populacional Mundial) Pesquise na internet para determinar a população mundial atual e
 a taxa anual de crescimento populacional mundial. Escreva um aplicativo que receba esses valores como entrada e, em
 seguida, exiba a estimativa da população mundial após um, dois, três, quatro e cinco anos.

Neste problema, você precisa pesquisar a população mundial atual e a taxa de crescimento anual e depois utilizar esses
 valores para calcular a estimativa da população mundial em cada um dos próximos cinco anos. Em seguida, exiba os
 resultados para o usuário.

A estimativa da população mundial após cada ano pode ser calculada com base na fórmula:

População após um ano = População atual + (Taxa de crescimento anual * População atual)

Você pode repetir esse cálculo para cada ano subsequente (dois, três, quatro e cinco anos) para obter as estimativas
correspondentes.

Lembrando que essas estimativas são apenas aproximações, pois a taxa de crescimento populacional pode variar ao
longo do tempo e outros fatores podem afetar a população mundial.
 */
fun main(args: Array<String>) {
    var populacaoAtual = 8041822857
    var taxaCrescimentoAnual = 0.9

    //Calcula a estimativa
    var estimativa:Long = (populacaoAtual + (taxaCrescimentoAnual * populacaoAtual)).toLong()

    println("Estimativa da populacao mundial apos um ano: $estimativa")

}