fun sumaCyfr(liczba: Int): Int {

    var wynik = 0
    var cyfra: Int
    var number = liczba

    while (number > 0) {

        cyfra = number % 10
        wynik += cyfra
        number /= 10

    }

    return wynik
}

fun mnozenie(czynnik1: Int, czynnik2: Int): Int {

    return czynnik1 * czynnik2

}


fun main(args: Array<String>) {

    println(sumaCyfr(513651214))
    println(mnozenie(sumaCyfr(987654321), sumaCyfr(513651214)))
}