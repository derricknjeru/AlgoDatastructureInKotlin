package fundamentals.classes

/**
 * There are many scenarios where you want a class to only have one instance. For example:
 *
 * Player stats in a mobile game for the current user.
 * Interacting with a single hardware device, like sending audio through a speaker.
 * An object to access a remote data source (such as a Firebase database).
 * Authentication, where only one user should be logged in at a time.
 */

object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}

//Declare objects as companion objects
/**
 * ou can define a singleton object inside another class using a companion object.
 * A companion object allows you to access its properties and methods from inside the class,
 * if the object's properties and methods belong to that class,
 * allowing for more concise syntax.
 */


fun main() {
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
}