package fundamentals.general

fun main() {
    // Prompt the user to enter a number
    println("Enter a number:")

    // Read the input as a string and convert it to an integer
    val numberString = readLine() ?: ""
    val number = numberString.toIntOrNull()

    // Check if the input is valid (an integer)
    if (number == null) {
        println("Invalid input. Please enter a number.")
    } else {
        // Extract the tens digit using string indexing and handle single-digit numbers
        val tensDigit = if (number < 10) {
            0
        } else {
            number.toString()[number.toString().length - 2].toString().toInt()
        }

        // Print the tens digit
        println("The tens digit is: $tensDigit")
    }
}
