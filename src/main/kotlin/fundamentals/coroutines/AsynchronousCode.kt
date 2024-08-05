package fundamentals.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    //Use the launch() function from the coroutines library to launch a new coroutine.
    /**
     * Coroutines in Kotlin follow a key concept called structured concurrency,
     * where your code is sequential by default and cooperates with an underlying event loop,
     * unless you explicitly ask for concurrent execution (e.g. using launch())
     */
    /*val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            launch {
                printForecastAsync()
            }
            launch {
                printTemperatureAsync()
            }

            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")*/

    //Use the async() function from the coroutines library if you care about when the coroutine finishes and need a return value from it.

    /*runBlocking {
        println("Weather forecast2")
        val forecast: Deferred<String> = async {
            getForecast()
        }
        val temperature: Deferred<String> = async {
            getTemperature()
        }
        println("${forecast.await()} ${temperature.await()}")
        println("Have a good day!")
    }*/

    //Parallel Decomposition involves taking a problem and breaking it into smaller subtasks that can be solved in parallel.

    /*runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }**/

    //Exceptions with coroutines
    /*runBlocking {
        println("Weather forecast")
        try {
            println(getWeatherReport())
        } catch (e: AssertionError) {
            println("Caught exception in runBlocking(): $e")
            println("Report unavailable at this time")
        }
        println("Have a good day!")
    }**/

    /*runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }**/

    ///Cancellation

    runBlocking {
        println("Weather forecast")
        println(getWeatherReport2())
        println("Have a good day!")
    }
}

suspend fun printForecastAsync() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperatureAsync() {
    delay(1000)
    println("30\u00b0C")
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"
}

suspend fun getWeatherReport2() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }

    delay(200)
    temperature.cancel()

    forecast.await()
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async {
        try {
            getTemperature()
        } catch (e: AssertionError) {
            println("Caught exception $e")
            "{ No temperature found }"
        }
    }

    "${forecast.await()} ${temperature.await()}"
}




