import kotlin.ArithmeticException
import kotlin.math.sqrt

fun sqrt(liczba: Double): Double {

    if (liczba < 0.0) throw ArithmeticException("Nie istnieje pierwiastek z liczby ujemnej!")

    return sqrt(liczba)

}

fun main(args: Array<String>) {

    print("Podaj liczbę do spierwiastkowania: ")
    val inputNumber = readLine()!!

    try {
        println(sqrt(inputNumber.toDouble()))
    } catch (e: NumberFormatException) {
        println("$e \nDane wejściowe są nieprawidłowe!")
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}