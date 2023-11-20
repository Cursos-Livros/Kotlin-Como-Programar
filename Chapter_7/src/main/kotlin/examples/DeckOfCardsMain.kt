package examples

import java.security.SecureRandom

fun main() {
    val myDeckOfCards = DeckOfCards()

    myDeckOfCards.shuffle()

    for (i in 1..52) {
        print("%-19s".format(myDeckOfCards.deal()))
        if (i % 4 == 0) { // output a newline after every fourth card
            println()
        }
    }
}

// The class receive index of face and index of suits
class Card(private val faceIndex: Int, private val suitIndex: Int) {

    private val faces = arrayOf("Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King")
    private val suits = arrayOf("Hearts", "Diamonds", "Clubs", "Spades")

    override fun toString(): String {
        val face = faces[faceIndex]
        val suit = suits[suitIndex]
        return "$face of $suit"
    }
}

class DeckOfCards {
    private val randomNumber = SecureRandom() // Generates a Random Number
    private val numberOfCards = 52 // The seed of the maximum value to random number
    private var currentCard = 0 // index for currentCard

    // Create a deck with a array of objects Card
    //private val deck: Array<Card> = Array(numberOfCards) { Card(0, 0) }
    private val deck: MutableList<Card> = MutableList(numberOfCards) { Card(0, 0) }

    //
    // Init fill the deck with cards
    init {
        for (count in deck.indices) {
            deck[count] = Card((count % 13), (count / 13))
            // Card((count % 13), (count / 13)
        }
    }

    // Method to shuffle the cards
    // Change the position 52 times
    fun shuffle() {
        for (first in deck.indices) {
            val second = randomNumber.nextInt(numberOfCards)
            val temporary = deck[first]
            deck[first] = deck[second]
            deck[second] = temporary
        }
    }

    // Delivery all cards
    fun deal(): Card? {
        return if (currentCard < deck.size) {
            deck[currentCard++]
        } else {
            null
        }
    }
}