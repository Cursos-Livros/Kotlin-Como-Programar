//5.15 (Cálculos de hipotenusa) Defina um método de hipotenusa que calcula a hipotenusa de
//um triângulo retângulo quando os comprimentos dos outros dois lados são dados. O método deve receber dois argumentos do
//    tipo double e retornar a hipotenusa como um double. Incorporar este método em um
//aplicativo que lê os valores de lado1 e lado2 e realiza o cálculo com a hipotenusa
//método. Use os métodos matemáticos pow e sqrt para determinar o comprimento da hipotenusa para cada um dos
//triângulos na Fig. 5.11. [Observação: a classe Math também fornece o método hypot para realizar esse cálculo.]
fun main() {
    println("Digite o 1  numero")
    var lado1 = leInput2()
    println("Digite o 2  numero")
    var lado2 = leInput2()

    lado1 = elevaQuadrado(lado1)
    lado2 = elevaQuadrado(lado2)

    var somaLados = lado1 + lado2

    var hipotenusa = calculaHipotenusa(somaLados)

    println("lado 1 \t lado2 \t Hipotenusa")
    println("$lado1 \t $lado2 \t $hipotenusa")
}

fun leInput2(): Double {
    val input = readLine() ?: "0"
    val numero = input.toDouble()
    return numero
}

fun elevaQuadrado(ladoQuadrado: Double): Double {
    return Math.pow(ladoQuadrado, 2.0)
}

fun calculaHipotenusa(valorSomaQuadrado: Double): Double {
    return Math.sqrt(valorSomaQuadrado)
}