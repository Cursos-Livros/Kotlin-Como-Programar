import java.util.Scanner

/*
2.33 (Calculadora do Índice de Massa Corporal) Nós introduzimos a calculadora do Índice de Massa Corporal (IMC) no
Exercício 1.10. As fórmulas para calcular o IMC são:

IMC = peso / altura^2 (em libras e polegadas)
ou
IMC = peso / altura^2 (em quilogramas e metros)

Crie uma calculadora de IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso do
usuário em quilogramas e a altura em metros). Em seguida, calcule e exiba o Índice de Massa Corporal do usuário.
Também exiba as categorias de IMC e seus valores do National Heart Lung and Blood Institute, disponíveis em
http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm, para que o usuário possa avaliar seu IMC.

[Nota: Neste capítulo, você aprendeu a usar o tipo int para representar números inteiros. Os cálculos de IMC, quando
feitos com valores int, produzirão resultados em números inteiros. No Capítulo 7, você aprenderá a usar o tipo double
para representar números com pontos decimais. Quando os cálculos de IMC são realizados com doubles, eles produzirão
números com pontos decimais - esses são chamados de números de "ponto flutuante".]
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Digite seu peso")
    var peso: Double = input.nextDouble()
    println("Digite sua altura")
    var altura: Double = input.nextDouble()

    //Calculo IMC
    var imc = peso / Math.pow(altura, 2.0)

    //Mostra características
    if (imc <= 18.5) {
        println("Abaixo do peso")
    }
    if (imc > 18.5 && imc <=24.9) {
        println("Peso normal")
    }
    if (imc >= 25 && imc <=29.9) {
        println("Acima do peso")
    }
    if (imc >=30) {
        println("Obesidade")
    }


}