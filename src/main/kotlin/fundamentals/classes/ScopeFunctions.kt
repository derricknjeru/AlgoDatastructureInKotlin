package fundamentals.classes

//Replace long object names using let()
class Quiz4 {
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    fun printQuiz() {
        val question1 = QuestionData<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
        val question2 = QuestionData<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
        val question3 = QuestionData<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

}

fun main() {
    //Call an object's methods without a variable using apply()
    //https://kotlinlang.org/docs/scope-functions.html
    Quiz4().apply {
        printQuiz()
    }
}