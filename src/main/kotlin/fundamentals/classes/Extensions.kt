package fundamentals.classes

class Quiz2 {
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

//Add an extension property
val Quiz2.StudentProgress.progressText: String
    get() = "$answered of $total answered"

//Add an extension function

fun Quiz2.StudentProgress.printProgressBar() {
    repeat(answered) { print("▓") }
    repeat(total - answered) { print("▒") }
    println()
    println(Quiz2.progressText)
}

fun main() {
    Quiz2.printProgressBar()
}