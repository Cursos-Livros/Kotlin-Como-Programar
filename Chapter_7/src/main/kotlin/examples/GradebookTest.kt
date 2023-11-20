package examples

fun main() {
    // Two-dimensional array of student grades
    val gradesArray = mutableListOf(
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

    // Create a GradeBook object
    val myGradeBook = GradeBook("CS101 Introduction to Java Programming", gradesArray)

    // Print a welcome message
    println("Welcome to the grade book for")
    println(myGradeBook.courseName)
    println()

    // Process grades
    myGradeBook.processGrade()
}


class GradeBook(private val initialCourseName: String, val initialGrades: MutableList<MutableList<Int>>) {
    var courseName: String = initialCourseName
        private set
    private val grades: MutableList<MutableList<Int>> = initialGrades

    // Process Data
    fun processGrade() {
        outputGrades()
        println("Lowest grade in the grade book is ${getMinimum()} Highest grade in the grade book is ${getMaximum()}")
        outputBarChart()
    }

    fun outputGrades() {
        println("The grades are:%n%n")
        print(" ") // align column heads

        // create a column heading for each of the tests
        for (test in grades[0].indices) {
            print("Test ${test + 1} ")
        }

        println("Average") // student average column heading

        // create rows/columns of text representing array grades
        for (student in grades.indices) {
            print("Student ${student + 1}")

            for (test in grades[student]) { // output student's grades
                print("%8d".format(test))
            }

            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            val average = getAverage(grades[student])
            print("%9.2f%n".format(average))
        }
    }

    // Find minimum grade
    fun getMinimum(): Int {
        var lowGrade = grades[0][0]

        for (row in grades.indices) {
            for (element in grades[row].indices) {
                if (lowGrade > grades[row][element]) {
                    lowGrade = grades[row][element]
                }
            }
        }
        return lowGrade
    }

    // Find maximum grade
    fun getMaximum(): Int {
        var maximumGrade = grades[0][0]

        for (row in grades.indices) {
            for (element in grades[row].indices) {
                if (maximumGrade < grades[row][element]) {
                    maximumGrade = grades[row][element]
                }
            }
        }
        return maximumGrade
    }

    // Array to store the grade for a particular grade
    fun getAverage(setOfGrades: MutableList<Int>): Double {
        var total = 0

        // sum grades for one student
        for (grade in setOfGrades) {
            total += grade
        }

        // return average of grades
        return total.toDouble() / setOfGrades.size
    }

    // Output bar chart
    fun outputBarChart() {
        println("Overall grade distribution:")

        val frequency = IntArray(11)

        for (studentGrades in grades) {
            for (grade in studentGrades) {
                ++frequency[grade / 10]
            }
        }

        for (count in frequency.indices) {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10) {
                println("%5d: ".format(100))
            } else {
                print("%02d-%02d: ".format(count * 10, count * 10 + 9))
            }

            // print bar of asterisks
            repeat(frequency[count]) {
                print("*")
            }

            println()
        }
    }


}