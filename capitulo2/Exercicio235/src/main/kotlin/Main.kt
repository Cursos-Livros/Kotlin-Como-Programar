import java.util.Scanner

/*
2.35 (Estatísticas para a Grande Pirâmide de Gizé) A Grande Pirâmide de Gizé é considerada uma maravilha da engenharia
de sua época. Utilize a internet para obter estatísticas relacionadas à Grande Pirâmide de Gizé e descubra o número
estimado de pedras usadas para construí-la, o peso médio de cada pedra e o número de anos que levou para construí-la.
Crie um aplicativo que calcule uma estimativa de quanto, em peso, da pirâmide foi construído a cada ano, a cada hora e a
 cada minuto durante a construção. O aplicativo deve solicitar as seguintes informações:
a) Número estimado de pedras usadas.
b) Peso médio de cada pedra.
c) Número de anos levados para construir a pirâmide (supondo que um ano tenha 365 dias).

Lembrando que essas estimativas são baseadas em informações disponíveis e podem não representar precisamente os
números reais, uma vez que detalhes exatos da construção da Grande Pirâmide de Gizé ainda podem ser objeto de debate
e pesquisa histórica.
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var pedrasUsadas: Int = 0
    var pesoMedioPedra: Double = 0.0
    var numeroAnos: Int = 0
    var calculo: Long = 0L

    println("Estatísticas do peso para a Grande Pirâmide de Gizé")
    println("Digite a quantidade de pedras usadas:")
    pedrasUsadas = input.nextInt()
    println("Digite ao peso media de cada pedra:")
    pesoMedioPedra = input.nextDouble()
    println("Numero de anos levados para a construcao")
    numeroAnos = input.nextInt()

    //Calcula o valor
    calculo = ((pesoMedioPedra * pedrasUsadas) * numeroAnos).toLong()

    println("Peso estimado da piramide é de: $calculo")


}