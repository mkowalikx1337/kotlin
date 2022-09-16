package exercises

/*
3. Write a program to differentiate between val and var.
 */

fun main(args: Array<String>) {
    var test: String = "test"
    val test1: String = "test"

    test = "tset"
    //test1 = "tset" //val cannot be reassigned

    println("$test, $test1")
}