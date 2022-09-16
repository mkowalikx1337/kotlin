package exercises

/*
Write a program in kotlin to map the following -

Item 1, Item 2, Item 3, Item 4

22, 10, 12, 33
 */

fun main(args: Array<String>) {

    var items = mapOf(Pair("Item 1", 22), Pair("Item 2", 10), Pair("Item 3", 12), Pair("Item 3", 33))

    println("$items")
}