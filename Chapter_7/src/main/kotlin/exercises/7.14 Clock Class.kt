package exercises

fun main() {
    println("Enter the value of the hour:")
    val inputHourTime = readln().toInt()

    println("Enter the value of the minute:")
    val inputHourMinute = readln().toInt()

    println("Enter the value of the second:")
    val inputHourSecond = readln().toInt()

    val clock = Clock(inputHourTime, inputHourMinute, inputHourSecond)

    println(clock.displayTime())

}

class Clock(val initialHour: Int, val initialMinute: Int, val initialSecond: Int) {

    private var hour: Int = initialHour
    private var minute: Int = initialMinute
    private var second: Int = initialSecond

    init {
        if (initialHour > 23 && initialMinute > 59 && initialSecond> 59) {
            hour = 0
            minute = 0
            second = 0
        }
    }

    fun displayTime(): String {
        return "$hour:$minute:$second"
    }
}