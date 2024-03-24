package fundamentals.collections.highorderfunctionswithcollections

fun main() {
    /**
     * Whereas the result of the map()
     * function always yields a collection of the same size,
     * filter() yields a collection of the same size or smaller than the original collection.
     * Unlike map(), the resulting collection also has the same data type,
     * so filtering a List<Cookie> will result in another List<Cookie>.
     */


    val cookies = listOf(
        Cookie(
            name = "Chocolate Chip",
            softBaked = false,
            hasFilling = false,
            price = 1.69
        ),
        Cookie(
            name = "Banana Walnut",
            softBaked = true,
            hasFilling = false,
            price = 1.49
        ),
        Cookie(
            name = "Vanilla Creme",
            softBaked = false,
            hasFilling = true,
            price = 1.59
        ),
        Cookie(
            name = "Chocolate Peanut Butter",
            softBaked = false,
            hasFilling = true,
            price = 1.49
        ),
        Cookie(
            name = "Snickerdoodle",
            softBaked = true,
            hasFilling = false,
            price = 1.39
        ),
        Cookie(
            name = "Blueberry Tart",
            softBaked = true,
            hasFilling = true,
            price = 1.79
        ),
        Cookie(
            name = "Sugar and Sprinkles",
            softBaked = false,
            hasFilling = false,
            price = 1.39
        )
    )

    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }


}