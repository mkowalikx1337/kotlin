package exercises

/*
1. Write a program in Kotlin to print prime numbers between 1 and 100.
 */

fun main(args: Array<String>) {

    for(i in 1..100) {
        if (isPrime(i)) {
            print("$i, ")
        }
    }
}

fun isPrime(number: Int): Boolean {
    var numberX = number

    if (numberX % 2 == 0) {
        return true
    }
    return false
}