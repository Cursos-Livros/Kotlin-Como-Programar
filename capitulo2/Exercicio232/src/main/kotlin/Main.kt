import java.util.Scanner

/*
2.32 (Valores Negativos, Positivos e Zeros) Escreva um programa que solicite cinco números e determine e imprima a
quantidade de números negativos, a quantidade de números positivos e a quantidade de zeros digitados.
 */
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var contadorPositivo = 0
    var contadorNegativo = 0
    var contadorZero = 0

    println("Digite valor 1")
    var numero1 = input.nextInt()
    println("Digite valor 2")
    var numero2 = input.nextInt()
    println("Digite valor 3")
    var numero3 = input.nextInt()
    println("Digite valor 4")
    var numero4 = input.nextInt()
    println("Digite valor 5")
    var numero5 = input.nextInt()

    //Testa numeros positivos
    if (numero1 > 0) {
        contadorPositivo += 1
    } else if (numero1 < 0) {
        contadorNegativo += 1
    } else {
        contadorZero += 1
    }

    if (numero2 > 0) {
        contadorPositivo += 1
    } else if (numero2 < 0) {
        contadorNegativo += 1
    } else {
        contadorZero += 1
    }

    if (numero3 > 0) {
        contadorPositivo += 1
    } else if (numero3 < 0) {
        contadorNegativo += 1
    } else {
        contadorZero += 1
    }

    if (numero4 > 0) {
        contadorPositivo += 1
    } else if (numero4 < 0) {
        contadorNegativo += 1
    } else {
        contadorZero += 1
    }

    if (numero5 > 0) {
        contadorPositivo += 1
    } else if (numero5 < 0) {
        contadorNegativo += 1
    } else {
        contadorZero += 1
    }

    println("Numeros Positivos \t Numeros Negativos \t Numero Zero")
    println("$contadorPositivo \t\t\t\t\t $contadorNegativo \t\t\t\t\t\t $contadorZero")
}