package fundamentals.collections

fun main() {
    /**
     * A Map is a collection consisting of keys and values.
     * It's called a map because unique keys are mapped to other values.
     * A key and its accompanying value are often called a key-value pair.
     * A map's keys are unique. A map's values, however, are not.
     * Two different keys could map to the same value. For example, "Mercury" has 0 moons, and "Venus" has 0 moons.
     *
     * Accessing a value from a map by its key is generally faster than searching through a large list, such as with indexOf().
     *
     * Maps can be declared using the mapOf() or mutableMapOf() function.
     * Maps require two generic types separated by a comma—one for the keys and another for the values.
     */

    val solarSystem = mutableMapOf<String, Int>(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystem.size)
    //You can use subscript syntax to set additional key-value pairs. Set the key "Pluto" to a value of 5.
    solarSystem["Pluto"] = 5

    println(solarSystem.size)

    // You can use subscript syntax to get a value. Print the number of moons for the key "Pluto".
    // If there isn't a key-value pair, it will return null.
    println(solarSystem["Pluto"])

    //You can use get,  If there isn't a key-value pair, it will return null.
    println(solarSystem.get("Theia"))

    solarSystem.remove("Pluto")
    println(solarSystem.size)
    /**
     * Subscript syntax, or the put() method, can also modify a value for a key that already exists.
     * Use subscript syntax to update Jupiter's moons to 78 and print the new value.
     */

    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}