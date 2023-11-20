/*
6.11 Write statements that perform the following one-dimensional-array operations:
a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
b) Multiply each of the twenty elements of integer array bonus by 2.
c) Display the ten values of integer array bestScores, each on a new line.
 */

fun main() {
    val array = arrayOfNulls<Int>(20)

    // Initialize Array
    for (i in array.indices) {
        array[i] = i + 1
        if (i == 9 || i == 19) {
            array[i] = 0
        }
    }

    for (i in array.indices) {
        array[i] = i + 1
        if (i == 9 || i == 19) {
            array[i] = 0
        }
    }

    // Show the Array
    for (i in array.indices) {
        println("${array[i]}")
    }
}