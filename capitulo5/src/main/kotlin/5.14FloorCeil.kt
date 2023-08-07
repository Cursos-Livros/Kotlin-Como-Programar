import kotlin.math.ceil
import kotlin.math.floor

//5.14 (Floor e Ceil) Escreva dois métodos myFloor e myCeil que recebem um num duplo positivo
//variável int myFloor(double num) e int myCeil(double num).
//O método myFloor pega num e retorna o maior número inteiro menor ou igual a x.
//A função myCeil pega num e localiza o menor número que é maior ou igual a x. Fazer
//não use nenhum método de classe Math. Incorpore este método em um aplicativo que envia um duplo
//valor para as funções e testa sua capacidade de calcular a saída necessária.
fun main() {
    val numero = leInput()
    val arredondaPraBaixo = floor(numero)
    val arredondaPraCima = ceil(numero)
    println("Arredonda para baixo $arredondaPraBaixo")
    println("Arredonda para cima $arredondaPraCima")
}

fun leInput(): Double {
    println("Digite um numero")
    val input = readLine() ?: "0"
    val numero = input.toDouble()
    return numero
}