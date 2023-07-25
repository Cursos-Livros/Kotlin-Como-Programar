/*
4.20 (Calculando o Valor de π) Calcule o valor de π a partir da série infinita
Imprima uma tabela que mostre o valor de π aproximado pelo cálculo dos primeiros 200.000 termos deste
Series. Quantos termos você precisa usar antes de obter um valor que começa com 3,14159
 */
fun main(args: Array<String>) {
    var pi: Double = 4.0
    var numerador = 4.0
    var denominador = 3.0
    var constantePi = 3.1415

    for (i in 1..20000) {
        //subtrai
        if (i % 2 == 1) {
            pi -= numerador / denominador
        } else {
            pi += numerador / denominador
        }
        //Tabela
        println("$i: $pi")
        //Marca quando pi vale 3.14159
        if (pi == constantePi) {
            print("Achou")
        }
        denominador += 2.0
    }

}