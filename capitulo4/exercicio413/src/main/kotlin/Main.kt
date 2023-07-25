import kotlin.random.Random

/*
4.13 (A Soma de uma Série) Encontre a soma da sequência de números 1, 2, 3... n, onde n varia de 1 a 100. Use o tipo
longo (long) para armazenar os resultados. Exiba os resultados em um formato tabular que mostre n e a soma
correspondente. Se esta fosse uma multiplicação em vez de uma soma, que dificuldade você poderia encontrar com a
variável que acumula o produto?
 */
fun main(args: Array<String>) {
    val random = Random(System.currentTimeMillis())
    var soma = 0
    val numeroAleatorio = random.nextInt(1, 100)

    for (i in 0..numeroAleatorio) {
        soma += i
    }

    println(numeroAleatorio)
    println(soma)
}