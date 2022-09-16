import kotlin.math.roundToInt

fun main(args: Array<String>) {

    var obiekt: Any = "Rafal"

    when(obiekt) {

        is String -> {
            println("To jest String")
            println(obiekt.toUpperCase())
        }

        is Int -> {
            println("To jest Int")
            println("+12 = ${obiekt + 12}")
        }

        is Float -> {
            println("To jest Float")
            println(obiekt.roundToInt())
        }

        is Char -> {
            println("To jest Char")
            println("$obiekt = Znak")
        }

        is Long -> {
            println("To jest Long")
            println("Wartość wynosi $obiekt")
        }

        else -> println("Stworzyłeś jakieś monstrum!")
    }

}