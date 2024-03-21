package learning.general

fun main() {
    numberDivide()
}

fun trafficLightColor() {
    val trafficLightColor = "Red"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
}

fun trafficLightColorWhen() {
    val trafficLightColor = "Amber"

    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }

    println(message)
}

fun HealthySleep() {
    /**
     * Ann watched a TV program about health and learned that she should sleep at least
    �
    A
    hours per day, but oversleeping is also not healthy and you should not sleep more than
    �
    B
    hours. Now Ann sleeps
    �
    H
    hours per day. If Ann's sleep schedule complies with the requirements of that TV program – print "Normal". If Ann sleeps less than
    �
    A
    hours, output “Deficiency”, if she sleeps more than
    �
    B
    hours, output “Excess”.

    Input to this program are the three strings with variables in the following order:
    �
    A
    ,
    �
    B
    ,
    �
    H
    .
    �
    A
    is always less than or equal to
    �
    B
    .

    Please note letters case: the output should exactly correspond to what is required in the problem, i.e. if the program has to output "Excess", such output as "excess", "EXCESS", "ExCeSs" and others will not be considered correct.

    You should think carefully about all the conditions, which you need to use. A special attention should be paid to the strictness of the conditional operators used: distinguish between
    <
    <
    and
    ≤
    ≤
    ;
    >
    >
    and
    ≥
    ≥
    . In order to understand which ones to use, read carefully the problem statement.

    Sample Input 1:

    6
    10
    8
    Sample Output 1:

    Normal
    Sample Input 2:

    7
    9
    10
    Sample Output 2:

    Excess
    Sample Input 3:

    7
    9
    2
    Sample Output 3:

    Deficiency
     */
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    val message = when {
        h in a..b -> "Normal"
        h < a -> "Deficiency"
        else -> "Excess"
    }
    println(message)
}

fun numberDivide() {
    /**
     * Write a program that reads an integer number and checks if it is divisible by 2, 3, 5, or 6.

    If the number is divisible by M, the program should output "Divided by M".

    The program should check all the divisors listed above. The order of divisors in the result can be any.

    Tip: Use the modulo operator % to check whether a number divided by another one.

    Sample Input 1:

    6
    Sample Output 1:

    Divided by 2
    Divided by 3
    Divided by 6
     */
    val number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("Divided by 2")
    }
    if (number % 3 == 0) {
        println("Divided by 3")
    }
    if (number % 5 == 0) {
        println("Divided by 5")
    }
    if (number % 6 == 0) {
        println("Divided by 6")
    }

}

