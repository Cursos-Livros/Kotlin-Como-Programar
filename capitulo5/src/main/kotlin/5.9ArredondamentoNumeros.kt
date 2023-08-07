import kotlin.math.round
//5.9 (Arredondamento de números) Math.floor pode ser usado para arredondar valores para o inteiro mais próximo, por exemplo,
//duplo y = Math.floor(x 0,5);
//arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y. Escreva um aplicativo que
//lê valores duplos e usa a instrução anterior para arredondar cada um dos números para o mais próximo
//inteiro. Para cada número processado, exibir o número original e o número arredondado

fun main() {
    println("Digite o 1 numero:")
    var input = readLine() ?: ""
    var numero1 = input.toFloat()
    println("O $input convetido para inteiro é ${arredonda(numero1)}")

    println("Digite o 2 numero:")
    input = readLine() ?: ""
    var numero2 = input.toFloat()
    println("O $input convetido para inteiro é $numero2")

}

fun arredonda(numero: Float): Int {
    val resultado: Int = round(numero).toInt()
    return resultado
}