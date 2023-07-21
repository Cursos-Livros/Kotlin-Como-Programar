import java.util.Scanner

/*
3.24 (Validação de Entrada do Usuário) Modifique o programa da Figura 3.10 para validar suas entradas. Para qualquer
entrada, se o valor inserido for diferente de 1 ou 2, continue repetindo até que o usuário insira um valor correto.
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var numero: Int
    var contador = 0
    var acerto = 0
    var falhas = 0

    do {
        print("Digite um número (1 ou 2): ")
        numero = scanner.nextInt()

        //Verifica numero != de 1 e 2
        if (numero != 1 && numero != 2) {
            do {
                print("Digite  novamente um número (1 ou 2): ")
                numero = scanner.nextInt()
            } while (numero != 1 && numero != 2)
        } else if (numero == 1) {
            acerto += 1
        } else {
            falhas += 1
        }

        contador += 1
    } while (contador != 10)

    println("Acertos e falhas: $acerto , $falhas")
}