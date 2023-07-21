import java.util.Scanner

/*
3.17 (Consumo de Combustível) Os motoristas estão preocupados com o consumo de combustível de seus automóveis. Um
motorista tem registrado várias viagens, registrando as milhas percorridas e os galões usados para cada abastecimento.
Desenvolva um aplicativo em Java que irá receber como entrada as milhas percorridas e os galões usados (ambos como inteiros)
para cada viagem.
O programa deve calcular e exibir as milhas por galão obtidas em cada viagem e imprimir a média combinada de milhas por
galão obtidas em todas as viagens até o momento. Todos os cálculos de média devem produzir resultados de ponto flutuante.
Utilize a classe Scanner e a iteração controlada por sentinela para obter os dados do usuário.
 */
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var contador = 0
    var guardaKM = 0
    var guardaGaloes = 0

    println("Digite a quantidade de viagens realizadas:")
    var quantidadeViagens: Int = input.nextInt()

    while (contador < quantidadeViagens) {
        println("Digite a quantidade de Km percorridos na viagem ${contador + 1}:")
        var kmPercorrido: Int = input.nextInt()

        println("Digite a quantidade de galões usados na viagem ${contador + 1}:")
        var quantidadeGaloes: Int = input.nextInt()

        // Guarda o valor da soma total de km e galões
        guardaKM += kmPercorrido
        guardaGaloes += quantidadeGaloes

        contador += 1
    }

    var mediaConsumo = guardaKM.toFloat() / guardaGaloes.toFloat()

    println("A média de consumo foi de $mediaConsumo Km por galão.")
}