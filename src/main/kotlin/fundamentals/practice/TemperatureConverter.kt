package fundamentals.practice

fun main() {
    /**
     * write a program that converts a temperature from one scale to another with these formulas:
     *
     * Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
     * Kelvin to Celsius: ° C = K - 273.15
     * Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
     * */
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsiusToFahrenheit(it) }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvinToCelsius(it) }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheitToKelvin(it) }


    //Another way:

    // Celsius to Fahrenheit conversion
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius: Double -> celsius * 9.0 / 5.0 + 32 }

    // Kelvin to Celsius conversion
    val kelvinToCelsius = { kelvin: Double -> kelvin - 273.15 }
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)

    // Fahrenheit to Kelvin conversion
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}


fun celsiusToFahrenheit(celsius: Double): Double {
    return 9.0 / 5.0 * celsius + 32
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32) + 273.15
}

// Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
