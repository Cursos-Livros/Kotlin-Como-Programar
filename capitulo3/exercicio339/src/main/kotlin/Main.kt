import java.util.Scanner

/*
3.39 (Garantindo Privacidade com Criptografia) O crescimento explosivo das comunicações pela Internet e o armazenamento
de dados em computadores conectados à Internet aumentaram significativamente as preocupações com a privacidade. O campo
da criptografia se preocupa em codificar dados para torná-los difíceis (e, com as técnicas mais avançadas, impossíveis)
de serem lidos por usuários não autorizados. Neste exercício, você investigará um esquema simples para criptografar e
descriptografar dados.

Uma empresa que deseja enviar dados pela Internet solicitou que você escrevesse um programa para criptografá-los, de
forma que possam ser transmitidos com mais segurança. Todos os dados são transmitidos como números inteiros de quatro
dígitos. Seu aplicativo deve ler um número inteiro de quatro dígitos inserido pelo usuário e criptografá-lo da seguinte
maneira:

Substitua cada dígito pelo resultado de adicionar 7 ao dígito e obter o resto após dividir o novo valor por 10. Em
seguida, troque o primeiro dígito pelo terceiro e troque o segundo dígito pelo quarto. Depois, imprima o número inteiro
criptografado.

Escreva um aplicativo separado que receba um número inteiro criptografado de quatro dígitos e o descriptografe
(revertendo o esquema de criptografia) para formar o número original.

[Projeto de leitura opcional: Pesquise sobre "criptografia de chave pública" em geral e o esquema de chave pública
específico PGP (Pretty Good Privacy). Você também pode investigar o esquema RSA, amplamente utilizado em aplicações de alta segurança.]
 */
fun main(args: Array<String>) {
    val scanner = java.util.Scanner(System.`in`)

    // Criptografar o número de 4 dígitos
    println("Digite um número de 4 dígitos para criptografar:")
    var numero = scanner.nextInt()

    var digito = numero
    var divisor = 1000

    while (divisor >= 1) {
        val d = (digito / divisor + 7) % 10
        print(d)

        digito %= divisor
        divisor /= 10
    }
// falta mudar as posiçoes

    println("\n")

    // Descriptografar o número criptografado
    println("Digite o número criptografado de 4 dígitos para descriptografar:")
    var numeroCriptografado = scanner.nextInt()

    digito = numeroCriptografado
    divisor = 1000

    while (divisor >= 1) {
        val d = (digito / divisor + 3) % 10
        print(d)

        digito %= divisor
        divisor /= 10
    }
}