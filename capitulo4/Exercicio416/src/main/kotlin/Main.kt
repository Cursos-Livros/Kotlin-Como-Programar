import java.util.Scanner

/*
4.17 (Notas dos Alunos) Um grupo de cinco alunos obteve as seguintes notas: Aluno 1, 'A'; Aluno 2, 'C'; Aluno 3, 'B';
Aluno 4, 'A' e Aluno 5, 'B'. Escreva um aplicativo que leia uma série de pares de números da seguinte forma:
a) nome do aluno
b) nota do aluno em letras.

Seu programa deve usar uma instrução switch para determinar quantos alunos obtiveram a nota ‘A’,
quantos tiraram nota 'B', quantos tiraram nota 'C' e quantos tiraram nota 'D'. Use um
loop conforme necessário para inserir as notas dos cinco alunos e, finalmente, exibir os resultados.
 */
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var nome = ""
    var nota = ' '
    var notaA = 0
    var notaB = 0
    var notaC = 0
    var notaD = 0
    var notaF = 0

    for (i in 0..<5) {
        println("Digite o nome:")
        nome = readln()
        println("Digite a nota:")
        nota = scanner.next().single()

        when (nota) {
            'A' -> notaA++
            'B' -> notaB++
            'C' -> notaC++
            'D' -> notaD++
            else -> println("Nota inválida")
        }
    }

    println(notaA)
    println(notaB)
    println(notaC)
    println(notaD)
}