package examples

fun main() {
    val testArray = mutableListOf(
        mutableListOf(87, 96, 70),
        mutableListOf(68, 87, 90),
        mutableListOf(94, 100, 90),
        mutableListOf(100, 81, 82),
        mutableListOf(83, 65, 85),
        mutableListOf(78, 87, 65),
        mutableListOf(91, 94, 100),
        mutableListOf(76, 72, 84),
        mutableListOf(87, 93, 73),
    )

    test(testArray)
}

fun test(testArray: MutableList<MutableList<Int>>) {
    for (line in testArray) {
        println(line)

    }

    for(line in testArray.indices){
        for(element in testArray[line].indices){
            println(testArray[line][element])
        }
        println()
    }
}