import java.util.Scanner

/*
A fórmula que você apresentou é uma série para estimar o valor da constante matemática "e". Essa série é conhecida como
a série de Taylor da função exponencial, que é usada para calcular uma aproximação da constante "e".

A série é representada da seguinte forma:

e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + 1/5! + ...

O número de termos dessa série determina a precisão da estimativa de "e". Quanto mais termos são incluídos, mais
precisa será a aproximação.

Para estimar o valor de "e", você pode criar um aplicativo que permita que o usuário insira o número de termos que
deseja usar na série e, em seguida, calcular a soma correspondente aos termos. Quanto maior o número de termos, mais
próximo o resultado estará do valor real de "e".
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var produtoFatorial = 1

    println("Digite o numero que inicia o fatorial")
    var fatorial: Int = scanner.nextInt()

    //Testa se o numero é positivo
    var testaPositivo = fatorial >= 1

    if (testaPositivo) {
        //Calcula fatorial
        while (fatorial != 1) {
            produtoFatorial *= fatorial
            fatorial -= 1
        }
    } else {
        println("O numero é menor que 0")
        return
    }

    // Calcula constante e
    println("Digite o numero que final do valor da constante e")
    var constanteE: Int = scanner.nextInt()
    var produtoFatorialConstanteE = 1
    var divisaoConstanteE = 0.0
    var contador = 1
    var contadorFatorial = 0
    var resultado = 0.0

    // Avanca ate o fim da constante
    while (contador != constanteE) {
        contadorFatorial = contador
        //Calcula fatorial
        while (contadorFatorial != 1) {
            produtoFatorialConstanteE *= contadorFatorial
            contadorFatorial -= 1
        }
        divisaoConstanteE = 1 / produtoFatorialConstanteE.toDouble()
        resultado += divisaoConstanteE
        contador += 1
    }

    println("${produtoFatorial + 1}")
    println("$resultado")
}