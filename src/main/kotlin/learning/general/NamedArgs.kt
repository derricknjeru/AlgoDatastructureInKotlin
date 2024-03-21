package learning.general

fun main() {
    val res = nameArgs(y = 10, x = 1)
    println(res)

    val message = printMessage()
    println(message)

    stringTemplates()

    castingStringsToInt()

    basicMath()

    defaultArgs()

    val word = "Hello"
    println(word[0])
}

// Named arguments
// Default arguments
fun nameArgs(x: Int, y: Int = 2): Int {
    return x + y
}

fun printMessage(): String {
    return "Use the val keyword when the value doesn't change.\nUse the var keyword when the value can change.\nWhen you define a function, you define the parameters that can be passed to it. \nWhen you call a function, you pass arguments for the parameters."
}

fun stringTemplates() {
    val offer: String
    val item = "Google Chromecast"
    val discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

/**
 * Use toInt() when you're confident the String is a valid integer and want to handle errors explicitly.
 * Use toIntOrNull() when you're unsure and want to avoid exceptions, potentially handling the null case later.
 */
fun castingStringsToInt() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")
}

fun basicMath() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val result1 = sub(firstNumber, secondNumber)
    val anotherResult2 = sub(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result1")
    println("$firstNumber + $thirdNumber = $anotherResult2")
}

// Define add() function below this line
fun add(no1: Int, no2: Int): Int {
    return no1 + no2
}

fun sub(no1: Int, no2: Int): Int {
    return no1 - no2
}


fun defaultArgs() {
     val firstUserEmailId = "user_one@gmail.com"


    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(email = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(os: String = "Unknown OS", email: String): String {
    return "There's a new sign-in request on $os for your Google Account $email."
}
