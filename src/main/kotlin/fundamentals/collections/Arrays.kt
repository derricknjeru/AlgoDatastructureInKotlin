package fundamentals.collections

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = rockPlanets + gasPlanets

    //access element
    println(solarSystem[0])

    //Set/update
    solarSystem[0] = "Little Earth"
    println(solarSystem[0])

    //Has a fixed size
    //Below won't work
    // solarSystem[8] = "Pluto" //Index 8 out of bounds for length 8

    //If you want to make an array larger than it already is,
    // you need to create a new array. Define a new variable called newSolarSystem as shown.
    // This array can store nine elements, instead of eight.


    val newSolarSystem = arrayOf(
        "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"
    )

    println(newSolarSystem[8])

    //get index, if element is not there -1 is printed
    println(solarSystem.indexOf("Earth"))

    //Iterate over list elements using a for loop

    for (planet in solarSystem) {
        println(planet)
    }

}