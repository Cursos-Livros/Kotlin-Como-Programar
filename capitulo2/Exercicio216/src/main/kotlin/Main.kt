import java.util.Scanner

/*
2.16 (Comparando inteiros) Escreva um aplicativo que peça ao usuário para inserir um inteiro, obtenha
do usuário e exibe se o número e seu quadrado são maiores, iguais ou diferentes
até, ou menor que o número 100. Use as técnicas mostradas na Fig. 2.15.
*/
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)//instancia um objeto do tipo scanner
    var quadrado = 0.0 //necesario iniciar com 0.0 pois o resuldado vem em double

    println("Insira um numero inteiro")
    var numero = input.nextDouble()

    quadrado = Math.pow(numero, 2.0)

    if (numero >= 100.0 && quadrado >= 100.0) {
        println("O numero e seu quadrado sao maiores que 100")
    }
    if (numero < 100 && quadrado < 100) {
        println("O numero e seu quadrado sao menores que 100")
    }
    if (numero == 100.0 && quadrado == 100.0) {
        println("O numero e seu quadrado sao iguais a 100")
    }
    if (numero != 100.0 && quadrado != 100.0) {
        println("O numero e seu quadrado sao diferentes de 100")
    }

}