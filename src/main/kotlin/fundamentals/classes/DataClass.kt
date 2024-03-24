package fundamentals.classes

/**
 * When a class is defined as a data class, the following methods are implemented.
 *
 * equals()
 * hashCode(): you'll see this method when working with certain collection types.
 * toString()
 * componentN(): component1(), component2(), etc.
 * copy()
 *
 */
data class QuestionData<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = QuestionData<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionData<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionData<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
}