package fundamentals.general

fun main() {
    for (i in 0..9) println(i)

    val name = "John"
    val age = "21"

    println("Hello, my name is $name & I am $age years old")

    printAboveShape()
}

/*
#
##
###
####
#####
######
 */

fun printAboveShape() {
    for (i in 0..5) {
        println("#".repeat(i))
    }
}

/*
#
##
###
####
#####
######
 */

fun printAboveShape1() {
    for (i in 0..5) {
        for (j in 0..i) {
            print("#")
        }
        println()
    }
}