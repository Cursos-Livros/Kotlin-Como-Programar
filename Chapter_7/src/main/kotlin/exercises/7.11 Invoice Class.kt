package exercises

fun main() {
    // Initial product data
    println("Enter with de code of the product:")
    val inputCode = readlnOrNull()?.toString() ?: "000"
    println("Enter with the description of the product:")
    val inputDescription = readlnOrNull()?.toString() ?: "Product Any"
    println("Enter with the quantity to sold:")
    val inputQuantitySold = readlnOrNull()?.toInt() ?: 0
    println("Enter the price per item:")
    val inputPricePerItem = readlnOrNull()?.toDouble() ?: 0.0

    //Create a object invoice
    val invoice = InvoiceClass711(inputCode, inputDescription, inputQuantitySold, inputPricePerItem)

    // Show the items options
    println("Sold Invoice:")
    println("Product Code")
    println(invoice.number)
    println("Description:")
    println(invoice.description)
    println("Quantity sold:")
    println(invoice.quantity)
    println("Price per item")
    println(invoice.price)


    // Change some of the options
    println("You need change some of the items? Enter y or n")
    val inputChange = readln().single()
    if (inputChange == 'y') {
        println("Enter with one next options to change:")
        val inputOption = readln().single()
        println("Enter with the alteration:")
        val inputOptionAlteration = readlnOrNull() ?: "000"
        when (inputOption) {
            '1' -> invoice.setNumber(inputOptionAlteration)
            '2' -> invoice.setDescription(inputOptionAlteration)
            '3' -> invoice.setQuantity(inputOptionAlteration.toInt())
            '4' -> invoice.setPrice(inputOptionAlteration.toDouble())
        }
    }


    println("Total Amount:")

    println(invoice.getAmount())
}

class InvoiceClass711(val initialNumber: String, val initialDescription: String, val initialQuantity: Int, val initialPrice: Double) {
    var number: String = initialNumber
        private set
    var description: String = initialDescription
        private set
    var quantity: Int = initialQuantity
        private set
    var price: Double = initialPrice
        private set

    init {
        if (initialQuantity < 0) {
            quantity = 0
        }

        if (initialPrice < 0.0) {
            price = 0.0
        }
    }

    fun setNumber(newNumber: String) {
        this.number = newNumber
    }

    fun setDescription(newDescription: String) {
        this.description = newDescription
    }

    fun setQuantity(newQuantity: Int) {
        if (quantity < 0) {
            this.quantity = 0
        } else {
            this.quantity = newQuantity
        }
    }

    fun setPrice(newPrice: Double) {
        if (price < 0) {
            this.price = 0.0
        } else {
            this.price = newPrice
        }
    }

    fun getAmount(): Double {
        return quantity * price
    }
}