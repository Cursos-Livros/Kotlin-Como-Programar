package exercises

fun main() {
    println("1 Car:")
    println("Enter the model of the car")
    val inputModel = readlnOrNull() ?: "Standard"

    println("Enter the year of the car")
    val inputYear = readlnOrNull() ?: "2000"

    println("Enter the Price of the car")
    val inputPrice = readlnOrNull()?.toDouble() ?: 0.0

    val car1 = CarApplication713(inputModel, inputYear, inputPrice)

//    println("2 Car:")
//    println("Enter the model of the car")
//    val inputModel2 = readlnOrNull() ?: "Standard"
//
//    println("Enter the year of the car")
//    val inputYear2 = readlnOrNull() ?: "2000"
//
//    println("Enter the Price of the car")
//    val inputPrice2 = readlnOrNull()?.toDouble() ?: 0.0

//    val car2 = CarApplication713(inputModel2, inputYear2, inputPrice2)

    println("1 Car Report:")
    println("Car Model:  ${car1.model}")
    println("Car Year:  ${car1.year}")
    println("Car Price:  ${car1.price}")
    println("Car Discount: ${car1.getDiscount(0.05)}")

//    println("2 Car Report:")
//    println("Car Model:  ${car2.model}")
//    println("Car Year:  ${car2.year}")
//    println("Car Price:  ${car2.price}")
//    println("Car Discount: ${car1.getDiscount(7.0)}")

}

class CarApplication713(private val initialModel: String, private val initialYear: String, private val initialPrice: Double) {
    var model: String? = initialModel
        private set
    var year: String? = initialYear
        private set
    var price: Double = initialPrice

    init {
        if (price < 0.0) {
            price = 0.0
        }
    }

    fun getDiscount(discountValue: Double): Double {
        val discountCalculus = price * discountValue
        return price - discountCalculus
    }
}