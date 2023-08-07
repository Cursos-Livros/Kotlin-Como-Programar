//5.25 (Números primos) Um inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 são primos, mas 4, 6, 8 e 9 não são. O número 1,
//por definição, não é primo.
//a) Escreva um método que determine se um número é primo.
//b) Use este método em um aplicativo que determina e exibe todos os números primos
//menos de 10.000. Quantos números até 10.000 você precisa testar para garantir que
//você encontrou todos os primos?
//c) Inicialmente, você pode pensar que n/2 é o limite superior para o qual você deve testar para ver
//se um número n é primo, mas você só precisa ir tão alto quanto a raiz quadrada de n. Reescreva o programa e execute-o nos dois sentidos.

fun main() {
    for (i in 1..10000) {
        var primo = verificaPrimo(i)
        if (primo) {
            println("$i é primo")
        }
    }

}

fun verificaPrimo(numero: Int): Boolean {
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}


