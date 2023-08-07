//5.8 (Taxa de estacionamento) Um estacionamento cobra uma taxa mínima de $ 2,00 para estacionar até três
//horas. A garagem cobra um adicional de US$ 0,50 por hora para cada hora ou parte dela além de três
//horas. A cobrança máxima para qualquer período de 24 horas é de US$ 10,00. Suponha que não haja estacionamento para
//mais de 24 horas seguidas. Escreva um aplicativo que calcule e exiba as taxas de estacionamento
//para cada cliente que estacionou na garagem ontem. Você deve inserir as horas estacionadas para cada
//cliente. O programa deve exibir a cobrança do cliente atual e deve calcular e
//exibir o total acumulado dos recebimentos de ontem. Ele deve usar o método calculateCharges para determinar a cobrança de cada cliente.
fun main(args: Array<String>) {
    println("Quantidade de carros estacionada ontem:")
    val input = readLine() ?: "0"

    val quantidadeCarros = input.toInt()

    var totalRecebidoOntem = 0.0
    for (i in 1..quantidadeCarros) {
        val horas = calculaHoras()
        println("O cliente $i ficou $horas hora")
        val totalRecebido = totalRecebido(horas)
        println("Valor total: $totalRecebido")
        totalRecebidoOntem += totalRecebido
    }

    println("O tal recebido ontem foi de: $totalRecebidoOntem")
}

fun calculaHoras(): Int {
    println("Digite a quantidade horas cliente ficou")
    var input = readLine() ?: "0"
    val horas = input.toInt()
    return horas
}

fun totalRecebido(horas: Int): Double {

    var valorTotal = 0.0
    if (horas <= 3) {
        valorTotal += 2.00
    } else {
        valorTotal = totalRecebidoMais3horas(horas) + 2.00
    }
    return valorTotal
}

fun totalRecebidoMais3horas(horas: Int): Double {
    var valorTotalMais3 = 0.0

    if (horas >= 24) {
        valorTotalMais3 = 8.00
        return valorTotalMais3
    }

    for (i in 3..horas) {
        valorTotalMais3 += 0.5
    }
    return valorTotalMais3
}
