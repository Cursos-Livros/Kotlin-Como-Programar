//(Teste para ano bissexto) Escreva um aplicativo que solicite ao usuário que insira um ano e use um
//método chamado isLeapYear para verificar se é um ano bissexto
fun main() {
    println("Digite o 1  numero")
    var ano = leInput6()

    verificaBissexto(ano)

    if(verificaBissexto(ano)){
        println("O ano é bissexto")
    }else{
        println("O ano nao é bissexto")
    }
}

fun leInput6(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun verificaBissexto(ano: Int): Boolean {
    val bissexto = ano % 4 == 0
    return bissexto
}