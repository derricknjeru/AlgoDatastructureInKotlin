package fundamentals.practice

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

/**
 * write a program that prints the summary message based on the number of notifications that you received.
 * The message should include:
 *
 * The exact number of notifications when there are less than 100 notifications.
 * 99+ as the number of notifications when there are 100 notifications or more.
 *
 * Complete the printNotificationSummary() function so that the program prints these lines:
 *
 *
 * You have 51 notifications.
 * Your phone is blowing up! You have 99+ notifications.
 */
fun printNotificationSummary(numberOfMessages: Int) {
    val moreNotification = 99
    // Fill in the code.
    if (numberOfMessages < 100) println("You have $numberOfMessages notifications.")
    else println("Your phone is blowing up! You have $moreNotification+ notifications.")
}