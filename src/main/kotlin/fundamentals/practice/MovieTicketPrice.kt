package fundamentals.practice

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

/**
 * write a program that calculates these age-based ticket prices:
 *
 * A children's ticket price of $15 for people 12 years old or younger.
 * A standard ticket price of $30 for people between 13 and 60 years old.
 * On Mondays, discount the standard ticket price to $25 for this same age group.
 * A senior ticket price of $20 for people 61 years old and older.
 * Assume that the maximum age of a moviegoer is 100 years old.
 * A -1 value to indicate that the price is invalid when a user inputs an age outside the age specifications.
 */

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15  // Children (0-12 years old)
        in 13..60 -> if (isMonday) 25 else 30  // Standard price with Monday discount
        in 61..100 -> 20  // Seniors (61-100 years old)
        else -> -1  // Invalid age
    }
}