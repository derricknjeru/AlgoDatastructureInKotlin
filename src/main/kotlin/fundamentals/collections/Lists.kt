package fundamentals.collections

fun main() {
    /**
     * A list is an ordered, resizable collection, typically implemented as a resizable array.
     * When the array is filled to capacity and you try to insert a new element,
     * the array is copied to a new bigger array.
     */


    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem)
    println(solarSystem.size)

    // Access elements from a list
    println(solarSystem[2])
    println(solarSystem.get(3))

    //get index
    println(solarSystem.indexOf("Earth"))


    //get index, if element is not there -1 is printed
    println(solarSystem.indexOf("Earth"))

    //Iterate over list elements using a for loop
    for (planet in solarSystem) {
        print("$planet ")
    }
    println()


    // Add elements to a list
    //The ability to add, remove,
    // and update elements in a collection is exclusive to classes that implement the MutableList interface. I


    val solarSystem2 = mutableListOf(
        "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    )

    solarSystem2.add("Pluto")
    solarSystem2.add(3, "Theia")

    // Update elements at a specific index
    solarSystem2[3] = "Future Moon"

    //Remove elements from a list
    solarSystem2.removeAt(9)
    solarSystem2.remove("Future Moon")

    //use the in operator. You can check if an element is in a list u
    println("Future Moon" in solarSystem)

}