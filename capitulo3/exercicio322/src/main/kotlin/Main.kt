/*
3.22 (Saída em Tabela) Escreva um aplicativo Java que utilize estruturas de repetição para imprimir a seguinte tabela
de valores:

| N | N^2 | N^3 | N^4  |
|---|-----|-----|------|
| 1 |  1  |  1  |   1  |
| 2 |  4  |  8  |  16  |
| 3 |  9  |  27 |  81  |
| 4 | 16  |  64 |  256 |
| 5 | 25  | 125 |  625 |

 */
fun main(args: Array<String>) {
    var contador = 1

    println("| N | N^2 | N^3 | N^4  |")
    println("|---|-----|-----|------|")

    //Calcula portencia
    while (contador != 6) {
        println("| ${Math.pow(contador.toDouble(),1.0)}| ${Math.pow(contador.toDouble(),2.0)} | ${Math.pow(contador.toDouble(),3.0)}  |   ${Math.pow(contador.toDouble(),4.0)} |")
        contador += 1
    }
}