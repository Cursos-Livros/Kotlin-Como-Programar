//5.21 (Embelezando Strings) Escreva métodos que realizam cada uma das seguintes tarefas:
//a) Verifique se a string termina com um ponto final e, caso contrário, adicione um ponto final.
//b) Verifique se a string começa com letra maiúscula, caso contrário, coloque a primeira letra em maiúscula.
//c) Use os métodos desenvolvidos nas partes (a) e (b) e escreva um método beautifyString
//que recebe uma string do usuário e, em seguida, chama os métodos em (a) e (b) para garantir
//que a string está formatada corretamente, ou seja, a string tem um ponto final no final,
////e uma primeira letra maiúscula. Certifique-se de produzir a string depois de embelezada!

fun main() {
    println("Digite uma String")
    var string = leInput7()
    var tamanhoString = string.length

    val primeiraLetra = verificaPrimeiraLetra(string)
    val pontoFinal = verificaPontoFinal(string, tamanhoString)

    val bonita = verificaBonita(primeiraLetra, pontoFinal)

    if(bonita){
        println("A String é bonita")
    }else{
        println("A String nao é bonita")
    }
}

fun leInput7(): String {
    val input = readLine() ?: "0"
    return input
}

fun verificaPrimeiraLetra(string: String): Boolean {
    val primeiraLetra = string[0]
    val capitalizada = primeiraLetra.isUpperCase()
    return capitalizada
}

fun verificaPontoFinal(string: String, tamanhoString: Int): Boolean {
    val ultimoCharactere = string[tamanhoString - 1]
    val pontoFinal = ultimoCharactere == '.'
    return pontoFinal
}

fun verificaBonita(primeiraLetra: Boolean, pontoFinal: Boolean): Boolean {
    return primeiraLetra && pontoFinal
}