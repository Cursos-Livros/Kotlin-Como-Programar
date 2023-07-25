import java.util.Scanner

/*
4h30 (Questionário sobre os fatos do aquecimento global) A polêmica questão do aquecimento global tem sido amplamente
divulgada pelo filme “Uma Verdade Inconveniente”, com o ex-vice-presidente Al Gore. Sr. Gore
e uma rede de cientistas da ONU, o Painel Intergovernamental sobre Mudanças Climáticas, compartilharam o relatório de 2007
Prêmio Nobel da Paz em reconhecimento aos “seus esforços para construir e disseminar um maior conhecimento
sobre mudanças climáticas provocadas pelo homem.” Pesquise os dois lados da questão online. Crie uma pergunta de cinco
questionário de múltipla escolha sobre o aquecimento global, cada pergunta com quatro respostas possíveis (numeradas de 1 a
4). Seja objetivo e tente representar de forma justa os dois lados da questão. Em seguida, escreva um aplicativo que
administra o questionário, calcula o número de respostas corretas (zero a cinco) e retorna uma mensagem ao usuário.
Se o usuário acertar cinco questões, imprima  “Excelente”; se quatro, imprima “Muito bom"; se três ou menos,
imprima “Hora de atualizar seu conhecimento sobre o aquecimento global” e inclua uma lista de alguns dos sites onde você encontrou seus
fatos.
 */
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    //Pergunta do Quiz
    val questao1 = "Pergunta: Qual dos seguintes gases é um dos principais responsáveis pelo aquecimento global?"
    val questao2 = "O que é o efeito estufa?"
    val questao3 = "Qual das seguintes atividades humanas contribui significativamente para o aumento do CO2 na atmosfera?"
    val questao4 = "Pergunta: Quais são algumas das consequências do aquecimento global?"
    val questao5 = "Pergunta: Como podemos ajudar a combater o aquecimento global?"

    //Opcoes do quiz
    val opcao1 = "a) CO2 (Dióxido de Carbono)\n" +
            "b) O2 (Oxigênio)\n" +
            "c) N2 (Nitrogênio)\n" +
            "d) H2O (Água)"
    val opcao2 = "a) Um fenômeno natural que mantém a Terra aquecida durante o dia.\n" +
            "b) A capacidade da atmosfera de bloquear a radiação solar.\n" +
            "c) O aumento da temperatura global devido à ação humana.\n" +
            "d) A retenção de calor na atmosfera causada por gases como o CO2."
    val opcao3 = "a) Reciclagem de resíduos plásticos.\n" +
            "b) Uso de energia solar e eólica.\n" +
            "c) Desmatamento de florestas.\n" +
            "d) Consumo de alimentos orgânicos."
    val opcao4 = "a) Diminuição do nível do mar e aumento da biodiversidade.\n" +
            "b) Redução das temperaturas médias globais e aumento da cobertura de gelo.\n" +
            "c) Aumento de eventos climáticos extremos, como furacões e secas.\n" +
            "d) Expansão das áreas cultiváveis e maior disponibilidade de água doce."
    val opcao5 = "a) Utilizando mais carros movidos a combustíveis fósseis.\n" +
            "b) Reduzindo o consumo de energia elétrica.\n" +
            "c) Aumentando o desmatamento para uso agrícola.\n" +
            "d) Descartando resíduos plásticos no meio ambiente."

    // Resposta do quiz
    val resposta1 = "a"
    val resposta2 = "b"
    val resposta3 = "c"
    val resposta4 = "d"
    val resposta5 = "a"

    // Conta acertos e respostas
    var score = 0

    for (i in 1..5) {
        // Mostra perguntas e as opcoes
        when (i) {
            1 -> println("$questao1 \n$opcao1")
            2 -> println("$questao2 \n$opcao2")
            3 -> println("$questao3 \n$opcao3")
            4 -> println("$questao4 \n$opcao4")
            5 -> println("$questao5 \n$opcao5")
        }
        // Le as respostas
        var respostaUsuario: String = reader.next().single().lowercase()

        when (i) {
            1 -> if (respostaUsuario == resposta1) score++
            2 -> if (respostaUsuario == resposta2) score++
            3 -> if (respostaUsuario == resposta3) score++
            4 -> if (respostaUsuario == resposta4) score++
            5 -> if (respostaUsuario == resposta5) score++
            else -> println("Resposta Inválida")
        }
    }

    println("Seus pontos: $score")

    when (score) {
        5 -> println("Excelente")
        4 -> println("Muito Bom")
        else -> {
            println("Hora de melhorar os seus conhecimentos osbre aquecimento global")
            println("Websites para maiores informcoes:")
            println("- www.ipcc.ch")
            println("- www.climate.nasa.gov")
            println("- www.epa.gov/climate-change")
        }
    }
}
//Primeira versao
//var resposta = ' '
//var pontos = 0
//
//println("Questionário sobre os fatos do aquecimento global")
//println("Pergunta1: Qual dos seguintes gases é um dos principais responsáveis pelo aquecimento global?")
//println(
//"a) CO2 (Dióxido de Carbono)\n" +
//"b) O2 (Oxigênio)\n" +
//"c) N2 (Nitrogênio)\n" +
//"d) H2O (Água)"
//)
//println("Escolha uma das opçoes:")
//resposta = reader.next().single()
//if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
//    when (resposta) {
//        'a' -> pontos++
//    }
//} else {
//    println("Resposta inválida")
//}
//
//println("Questionário sobre os fatos do aquecimento global")
//println("Pergunta2: Pergunta: O que é o efeito estufa?")
//println(
//"a) Um fenômeno natural que mantém a Terra aquecida durante o dia.\n" +
//"b) A capacidade da atmosfera de bloquear a radiação solar.\n" +
//"c) O aumento da temperatura global devido à ação humana.\n" +
//"d) A retenção de calor na atmosfera causada por gases como o CO2.\n"
//)
//println("Escolha uma das opçoes:")
//resposta = reader.next().single()
//if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
//    when (resposta) {
//        'd' -> pontos++
//    }
//} else {
//    println("Resposta inválida")
//}
//
//println("Questionário sobre os fatos do aquecimento global")
//println("Pergunta: Qual dos seguintes gases é um dos principais responsáveis pelo aquecimento global?")
//println(
//"a) CO2 (Dióxido de Carbono)\n" +
//"b) O2 (Oxigênio)\n" +
//"c) N2 (Nitrogênio)\n" +
//"d) H2O (Água)"
//)
//println("Escolha uma das opçoes:")
//resposta = reader.next().single()
//if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
//    when (resposta) {
//        'a' -> pontos++
//    }
//} else {
//    println("Resposta inválida")
//}
//
//println("Questionário sobre os fatos do aquecimento global")
//println("Pergunta: Qual das seguintes atividades humanas contribui significativamente para o aumento do CO2 na atmosfera?")
//println(
//"a) Reciclagem de resíduos plásticos.\n" +
//"b) Uso de energia solar e eólica.\n" +
//"c) Desmatamento de florestas.\n" +
//"d) Consumo de alimentos orgânicos.\n"
//)
//println("Escolha uma das opçoes:")
//resposta = reader.next().single()
//if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
//    when (resposta) {
//        'c' -> pontos++
//    }
//} else {
//    println("Resposta inválida")
//}
//
//println("Questionário sobre os fatos do aquecimento global")
//println("Pergunta: Qual das seguintes atividades humanas contribui significativamente para o aumento do CO2 na atmosfera?")
//println(
//"a) Reciclagem de resíduos plásticos.\n" +
//"b) Uso de energia solar e eólica.\n" +
//"c) Desmatamento de florestas.\n" +
//"d) Consumo de alimentos orgânicos.\n"
//)
//println("Escolha uma das opçoes:")
//resposta = reader.next().single()
//if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
//    when (resposta) {
//        'c' -> pontos++
//    }
//} else {
//    println("Resposta inválida")
//}