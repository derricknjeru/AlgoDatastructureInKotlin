package fundamentals.classes

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")

}