package learning.general

import java.util.*
import kotlin.math.sqrt

fun main() {
    floorSpace()

    var constantVal = 1
    val goodName = "Derrick"
    println(goodName)

    // Create a scanner object for reading the input
    val scanner = Scanner(System.`in`)

    // Read the input string using scanner
    val input = scanner.nextLine()

    // Input string is separated by space, so split the string into parts
    val parts = input.split(" ")

    val firstName = parts[0]
    val secondName = parts[1]
    val age = parts[2]

    println(firstName)
    println(secondName)
    println(age)
}

//Use a comma (,) for multiple conditions
fun checkIfPrimeNumber(primeNumber: Int) {
    when (primeNumber) {
        2, 3, 5, 7 -> println("It is a prime number")
        else -> println("It is not a prime number")
    }
}

fun ftnNumbers() {
    // put your code here
    when (readln().toInt()) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> println("F")
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> println("T")
        1, 10, 100, 1000, 10000, 100000 -> println("P")
        else -> println("N")
    }

}


fun justCheckingLanguage() {
    val a = readln()
    when {
        "1.Java".contains(a) -> println("Yes!")
        "2.kotlin".contains(a) -> println("Yes!")
        "3.Scala".contains(a) -> println("Yes!")
        "4.Scala".contains(a) -> println("Yes!")
        else -> println("Unknown number")
    }
}

fun op() {
    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+", "plus" -> {
            val sum = a + b
            println(sum)
        }

        "-", "minus" -> {
            val diff = a - b
            println(diff)
        }

        "*", "times" -> {
            val product = a * b
            println(product)
        }

        else -> println("Unknown operator")
    }
}

//Use the in keyword for a range of conditions
fun checkIfPrimeNumber2(primeNumber: Int) {
    when (primeNumber) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }

}

fun checkIfPrimeNumber3(primeNumber: Any) {
    when (primeNumber) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}

fun checkIfPrimeNumber4(primeNumber: Int) {
    when (primeNumber) {
        2 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}

fun stringProcessor() {
    val firstString = readln()
    val op = readln()
    val secondString = readln()

    val message = when (op) {
        "equals" -> firstString == secondString
        "plus" -> firstString + secondString
        "endsWith" -> firstString.endsWith(secondString)
        else -> "Unknown operation"
    }

    println(message)
}


fun floorSpace() {
    val area = when (readLine()!!) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            calculateTriangleArea(a, b, c)
        }

        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            calculateRectangleArea(a, b)
        }

        "circle" -> {
            val r = readLine()!!.toDouble()
            calculateCircleArea(r)
        }

        else -> {
            println("Invalid shape")
            return
        }
    }
    println(area)
}

fun calculateTriangleArea(a: Double, b: Double, c: Double): Double {
    val semiPerimeter = (a + b + c) / 2
    return sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))
}

fun calculateRectangleArea(a: Double, b: Double): Double {
    return a * b
}

fun calculateCircleArea(r: Double): Double {
    return 3.14 * r * r
}

