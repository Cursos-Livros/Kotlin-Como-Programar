package exercises

fun main() {
    val account = Account710("User 1", 0.0)
    val account2 = Account710("User 2", 0.0)

    // Display the initial name of account
    print("Account 1 initial name is: ")
    println(account.name)
    print("Account 2 initial name is: ")
    println(account2.name)

    // Display the balance of accounts
    print("Account 1 balance: ")
    println(account.balance)
    print("Account 2 balance: ")
    println(account2.balance)

    // Order the name of accounts
    println("Please enter the name Account 1:")
    var inputName = readlnOrNull() ?: "User"
    account.name = inputName

    println("Please enter the name Account 2:")
    inputName = readlnOrNull() ?: "User"
    account2.name = inputName

    // Order the new deposit for accounts
    println("Enter deposit amount for account1:")
    var inputDeposit = readlnOrNull()?.toDouble() ?: 0.0
    account.deposit(inputDeposit)

    println("Enter deposit amount for account2:")
    inputDeposit = readlnOrNull()?.toDouble() ?: 0.0
    account2.deposit(inputDeposit)

    // Show the value of the balance after deposit
    print("Account 1 balance: ")
    println(account.balanceToString())
    print("Account 2 balance: ")
    println(account2.balanceToString())

    // Withdraw
    println("you desire make a withdraw? enter y or n")
    val inputResponse: Char = readln().single()

    if (inputResponse == 'y') {
        println("How much you need withdraw? ")
        val inputWithDrawValue: Double = readlnOrNull()?.toDouble() ?: 0.0
        account.withDraw(inputWithDrawValue)
    }
}

class Account710(val initialName: String, initialDeposit: Double) { // Primary Constructor
    var name: String? = initialName
        set(value) {
            field = value
        }

    var balance = initialDeposit
        private set

    init {
        require(initialDeposit >= 0.0) { "This quantity it's not permitted." }
    }

    fun deposit(newDeposit: Double) {
        balance += newDeposit
    }

    fun withDraw(newWithDraw: Double) {
        if(newWithDraw > balance){
            println( "Withdrawal amount exceeded account balance.")
        } else {
            balance -= newWithDraw
        }
    }

    // Format the value for 2 floating points
    fun balanceToString(): String {
        return String.format("%.2f",balance)
    }
}