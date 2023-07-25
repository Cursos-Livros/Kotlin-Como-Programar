/*
4.24 (Imprimindo uma matriz) Escreva um aplicativo que imprima a seguinte matriz bidimensional.
Use loops for para minimizar o número de instruções de saída.
 */
fun main(args: Array<String>) {
    //linha
    for (i in 1..5) {
        for (j in 1..5) {
            print("$i ")
        }
        println()
    }
}