package fundamentals.practice

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

/**
 *  write a program which prints out a person's profile details.
 *
 * Name: Amanda
 * Age: 33
 * Likes to play tennis. Doesn't have a referrer.
 *
 * Name: Atiqah
 * Age: 28
 * Likes to climb. Has a referrer named Amanda, who likes to play tennis.
 */
class Person(private val name: String, private val age: Int, private val hobby: String?, private val referrer: Person?) {
    fun showProfile() {
        // Fill in code
        println("Name: $name")
        println("Age: $age")
        println(
            "Likes to $hobby. ${
                if (referrer == null) "Doesn't have a referrer."
                else "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}."
            }"
        )
        println()
    }
}