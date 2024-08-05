package fundamentals.collections.scopefunctions

import kotlin.random.Random

fun main() {
    val str = "Hello"
    str.let {
        println("The string's length: ${it.length}")
    }

    str.run {
        println("The string's length: $length")
    }

    val i = getRandomInt()
    println(i)

}

// Context object example
fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        writeToLog("getRandomInt() generated value $it")
    }
}

fun writeToLog(s: String) {
    println(s)
}

//common object

fun commonObjectExample() {
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()
}

//Lambda result
fun lambdaResultExample() {
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")
}
//Lambda result
//Additionally, you can ignore the return value and use a scope function to create a temporary scope for local variables.

fun lambdaResultExample2() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }
}