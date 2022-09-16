package exercises

/*
 Write a program in Kotlin to replace is with was respectively in given string.
 */

fun main(args: Array<String>) {
    var text: String = "He is cryling ver loud."
    val validText: String = "${text.replace("is", "was")}"

    println(validText)
}