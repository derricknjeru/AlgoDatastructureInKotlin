package fundamentals.general

fun main() {
    val trickFunction = ::trick1 //:: function reference operator
    val trickFunction2 = trick2
    trickFunction2()
    treat()

    //Returning a function
    val trickFunction3 = trickOrTreat(true)
    val treatFunction3 = trickOrTreat(false)

    treatFunction3()
    trickFunction3()

    // passing function as a parameter
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }
    val coins2: (Int) -> String = {
        "$it quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction4 = trickOrTreat(false, coins)
    val trickFunction4 = trickOrTreat(true, cupcake)
    treatFunction4()
    trickFunction4()


    //Nullable function types

    val treatFunction5 = trickOrTreat2(false, coins)
    val trickFunction5 = trickOrTreat2(true, null)
    treatFunction5()
    trickFunction5()

    val treatFunction6 = trickOrTreat2(false, {
        "$it quarters"
    })
    treatFunction6()

    //Trailing lambda syntax,when a function type is the last parameter of a function
    val treatFunction7 = trickOrTreat2(false) {
        "$it quarters"
    }

    //kotlin standard library example function repeat
    repeat(4) {
        treatFunction7()
    }
}

fun trick1() {
    println("No treats 1")
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) trick2
    else treat
}

//Example of a higher order function, HOF: which takes a function as a parameter and return function type
fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick2
    } else {
        println(extraTreat(5))
        return treat
    }
}

fun trickOrTreat2(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick2
    } else {
        if (extraTreat != null) println(extraTreat(5))
        return treat
    }
}

val trick2 = {
    println("No treats 2")
}
val treat: () -> Unit = {
    println("Have a treat!")
}