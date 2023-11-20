fun main(args: Array<String>) {

    val pixel = Array(200) { i -> i + 1 }

    for (i in pixel.indices) {
        when (pixel[i]) {
            in 0 until 10 -> pixel[i] = 10
            in 11 until 20 -> pixel[i] = 30
            in 21 until 30 -> pixel[i] = 30
        }
    }

    for (i in 0..pixel.size - 1) {
        println("${pixel[i]}")
    }
}