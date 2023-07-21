import java.util.Scanner

/*
3.37 (Distância entre dois pontos) Escreva um aplicativo que leia as coordenadas x e y de dois pontos em um plano e
imprima se os pontos estão localizados em uma linha perpendicular a um eixo.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var coordenadaX1 = 0
    var coordenadaX2 = 0
    var coordenadaY1 = 0
    var coordenadaY2 = 0

    println("Digite as Corrdenadas de A. (X e depois Y)")
    coordenadaX1 = scanner.nextInt()
    coordenadaY1 = scanner.nextInt()

    println("Digite as Corrdenadas de B. (X e depois Y)")
    coordenadaX2 = scanner.nextInt()
    coordenadaY2 = scanner.nextInt()

    var testeEixoX = coordenadaX1 == coordenadaX2 && coordenadaY1 != coordenadaY2
    var testeEixoY = coordenadaY1 == coordenadaY2 && coordenadaX1 != coordenadaX2
    var testeNull = coordenadaY1 != coordenadaY2 && coordenadaX1 != coordenadaX2

    if(testeEixoX){
        println("Perpedicular ao eixo X")
    } else{
        println("Perpedicular ao eixo Y")
    }

}