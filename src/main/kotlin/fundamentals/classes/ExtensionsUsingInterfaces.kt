package fundamentals.classes

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}


class Quiz3 : ProgressPrintable {
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String
        get() = "$answered of $total answered"

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }
}
fun main() {
    Quiz3().printProgressBar()
}