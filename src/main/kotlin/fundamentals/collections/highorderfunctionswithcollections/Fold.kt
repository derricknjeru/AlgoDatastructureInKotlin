package fundamentals.collections.highorderfunctionswithcollections

fun main() {
    /**
     * The fold() function is used to generate a single value from a collection.
     * This is most commonly used for things like calculating a total of prices,
     * or summing all the elements in a list to find an average.
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

    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }

    println("Total price: $${totalPrice}")

    /**
     * Note: fold() is sometimes called reduce().
     * The fold() function in Kotlin works the same as the reduce() function found in JavaScript, Swift, Python,
     * etc. Note that Kotlin also has its own function called reduce(),
     * where the accumulator starts with the first element in the collection,
     * rather than an initial value passed as an argument.
     */

    /**
     * Note: Kotlin collections also have a sum() function for numeric types,
     * as well as a higher-order sumOf() function.
     */
}