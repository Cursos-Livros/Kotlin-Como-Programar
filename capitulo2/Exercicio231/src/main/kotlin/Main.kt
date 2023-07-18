/*
2.31 (Tabela de Quadrados e Cubos) Utilizando apenas as técnicas de programação que você aprendeu neste capítulo,
escreva um aplicativo que calcula os quadrados e cubos dos números de 0 a 10 e imprime os valores resultantes em
formato de tabela, conforme mostrado abaixo:

```
Número   Quadrado   Cubo
0        0          0
1        1          1
2        4          8
3        9          27
4        16         64
5        25         125
6        36         216
7        49         343
8        64         512
9        81         729
10       100        1000
```

Você pode calcular os quadrados usando a operação `n * n`, onde `n` é o número atual do loop, e calcular os cubos usando
a operação `n * n * n`. Em seguida, você pode usar estruturas de controle como um loop para calcular e imprimir os
valores na tabela.
 */
fun main(args: Array<String>) {
    var numero = 0
    var quadrado = Math.pow(numero.toDouble(), 2.0)
    var cubo = Math.pow(numero.toDouble(), 3.0)

    //Calcula os valores
    println("Numero \t Quadrado \t Cubo")
    println("$numero \t     $quadrado \t     $cubo")
    numero = 1
    quadrado = Math.pow(numero.toDouble(), 2.0)
    cubo = Math.pow(numero.toDouble(), 3.0)
    println("$numero \t     $quadrado \t     $cubo")
    numero = 2
    quadrado = Math.pow(numero.toDouble(), 2.0)
    cubo = Math.pow(numero.toDouble(), 3.0)
    println("$numero \t     $quadrado \t     $cubo")
    numero = 3
    quadrado = Math.pow(numero.toDouble(), 2.0)
    cubo = Math.pow(numero.toDouble(), 3.0)
    println("$numero \t     $quadrado \t     $cubo")
    numero = 4
    quadrado = Math.pow(numero.toDouble(), 2.0)
    cubo = Math.pow(numero.toDouble(), 3.0)
    println("$numero \t     $quadrado \t     $cubo")
    numero = 5
    quadrado = Math.pow(numero.toDouble(), 2.0)
    cubo = Math.pow(numero.toDouble(), 3.0)
    println("$numero \t     $quadrado \t     $cubo")
    numero = 6
    quadrado = Math.pow(numero.toDouble(), 2.0)
    cubo = Math.pow(numero.toDouble(), 3.0)
    println("$numero \t     $quadrado \t     $cubo")

}