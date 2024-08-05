package fundamentals.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    //runBlocking() is synchronous; it will not return until all work within its lambda block is completed.
    //That means it will wait for the work in the delay() call to complete
    //test1()

    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            printForecast()
            printTemperature()
        }
    }
    println("Execution time: ${time / 1000.0} seconds")


}

private fun test1() {
    runBlocking {
        println("Weather forecast")
        delay(1000)
        println("Sunny")
    }
}

//A suspending function is like a regular function, but it can be suspended and resumed again later.
suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}