//5.19 (Exibindo um Quadrado de Qualquer Caractere) Modifique o método criado no Exercício 5.18 para
//recebe um segundo parâmetro do tipo char chamado fillCharacter. Forme o quadrado usando o caractere fornecido como argumento.
//Assim, se side for 5 e fillCharacter for #, o método deve exibir
//Use a seguinte instrução (na qual a entrada é um objeto Scanner) para ler um caractere do usuário
//no teclado:
// next() retorna uma String e charAt(0) obtém o primeiro caractere da String
//char fill = input.next().charAt(0);
fun main() {
    println("Digite o caractere que forma os lados")
    var caractere = leInputCaracter()

    println("Digite o numero de lados")
    var lados = leInput5()
    desenhaQuadrados2(caractere, lados)
}

fun leInputCaracter(): Char {
    val input = readln().single()
    return input
}

fun leInput5(): Int {
    val input = readLine() ?: "0"
    return input.toInt()
}

fun desenhaQuadrados2(caracter: Char, lados: Int) {
    for (altura in 1..lados) {
        for (linha in 1..lados) {
            print("$caracter ")
        }
        println()
    }
}