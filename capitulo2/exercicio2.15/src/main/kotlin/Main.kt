/*
2.15 (Aritmética) Escreva um aplicativo que peça ao usuário para inserir dois números inteiros, obtenha-os
do usuário e imprime o quadrado de cada um, a soma de seus quadrados e a diferença dos quadrados
(primeiro número ao quadrado menos o segundo número ao quadrado). Use as técnicas mostradas na Fig. 2.7.
* */

import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`) //instancia um objeto do tipo leitor

    println("Digite o 1 numero")
    var numero1 = reader.nextDouble()
    println("Digite o 2 numero")
    var numero2 = reader.nextDouble()

    //variavel que guarda o quadrado
    var quadrado1 = Math.pow(numero1,2.0)
    var quadrado2 = Math.pow(numero2,2.0)

    //o metodo pow so funciona com double
    println("Quadrado numero 1")
    println(quadrado1)
    println("Quadrado numero 2")
    println(quadrado2)

    println("Diferenca")
    println(quadrado1 - quadrado2)

}