import java.util.Scanner

/*
2.28 (Diâmetro, Circunferência e Área de um Círculo) Aqui está uma prévia. Neste capítulo, você
aprendeu sobre inteiros e o tipo int. Java também pode representar números de ponto flutuante que contêm
pontos decimais, como 3,14159. Escreva um aplicativo que insira do usuário o raio de um círculo
como um número ime o diâmetro, a circunferência e a área do círculo usando o valor de ponto flutuante
3,14159 para π. Use as técnicasnteiro e impri mostradas na Fig. 2.7. [Nota: Você também pode usar a constante predefinida
 Math.PI para o valor de π.
Essa constante é mais precisa que o valor 3,14159. aula matemática
é definido no pacote java.lang. As classes desse pacote são importadas automaticamente, então você não
precisa importar a classe Math para usá-la.] Use as seguintes fórmulas (r é o raio):
diâmetro = 2r
circunferência = 2πr
área = πr2
Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor
que será gerado em uma instrução System.out.printf. Os valores produzidos pela circunferência
e cálculos de área são números de ponto flutuante. Esses valores podem ser gerados com o especificador de formato
%f em uma instrução System.out.printf. Você aprenderá mais sobre números de ponto flutuante no Capítulo 3.
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Digite o valor do raio do circulo")
    var raio: Int = input.nextInt()

    println("Diametro: " + Math.pow(raio.toDouble(),2.0))
    println("Circunferencia: " + (2 * (Math.PI * raio)))
    println("Área: " + (Math.PI * Math.pow(raio.toDouble(),2.0)))
}