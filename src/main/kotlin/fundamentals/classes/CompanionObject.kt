package fundamentals.classes

class Quiz {
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}


fun main() {
    /**
     * Even though these properties are declared in the StudentProgress object,
     * they can be accessed with dot notation using only the name of the Quiz class.
     */
    println("${Quiz.answered} of ${Quiz.total} answered.")
}