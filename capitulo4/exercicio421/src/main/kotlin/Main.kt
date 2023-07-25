/*
4.21 (Triplos Pitagóricos) Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros. O conjunto
de três valores inteiros para os comprimentos dos lados de um triângulo retângulo é chamada de tripla pitagórica.
Os comprimentos dos três lados devem satisfazer a relação de que a soma dos quadrados de dois dos
lados é igual ao quadrado da hipotenusa. Escreva um aplicativo que exiba uma tabela de
Ternos pitagóricos para lado1, lado2 e a hipotenusa, todos não maiores que 500. Use um triplo aninhado
loop for que tenta todas as possibilidades. Este método é um exemplo de computação de “força bruta”. Você vai
aprender em cursos de informática mais avançados que para muitos problemas interessantes não há
abordagem algorítmica conhecida além do uso de força bruta.
 */
fun main(args: Array<String>) {
    for (lado1 in 1..500) {
        for (lado2 in 1..500) {
            for (hipotenusa in 1..500) {
                if (Math.pow(lado1.toDouble(), 2.0) + Math.pow(lado2.toDouble(), 2.0) == Math.pow(hipotenusa.toDouble(), 2.0)) {
                    println("Ternos pitagóricos: $lado1, $lado2, $hipotenusa")
                }
            }
        }
    }
}