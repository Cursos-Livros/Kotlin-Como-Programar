package exercises

fun main() {
    println("Enter with the number of students:")
    val inputNumberStudents = readlnOrNull()?.toInt() ?: 0
    println("Enter with the number of exams:")
    val inputNumberExams = readlnOrNull()?.toInt() ?: 0

    // Create a GradeBook object
    val myGradeBook = GradeBook("CS101 Introduction to Java Programming", inputNumberStudents, inputNumberExams)

    // Set grades
    for (student in 1..inputNumberStudents) {
        for (exam in 1..inputNumberExams) {
            println("Enter grade for student $student on exam $exam:")
            val inputGrade = readlnOrNull()?.toInt() ?: 0
            myGradeBook.setGrade(student, exam, inputGrade)
        }
    }

    // Print a welcome message
    println("Welcome to the grade book for")
    println(myGradeBook.courseName)
    println()

    // Process grades
    myGradeBook.processGrade()
}


class GradeBook(val initialCourseName: String, numberStudents: Int, numberExams: Int) {
    var courseName: String = initialCourseName
        private set
    private val grades: MutableList<MutableList<Int>> = MutableList(numberStudents) { MutableList(numberExams) { -1 } }

    // Set a grade of particular students exams
    fun setGrade(student: Int, exam: Int, grade: Int) {
        if (student in 1..grades.size && exam in 1..grades[0].size) {
            grades[student - 1][exam - 1] = grade
        } else {
            println("Invalid student or exam index.")
        }
    }

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