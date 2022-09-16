fun main(args: Array<String>) {

    val liczba: Int = 10
    var drugaLiczaba: Int = readLine()!!.toInt()

    if (drugaLiczaba > liczba) println("Podana liczba jest większa od $liczba")
    else if (drugaLiczaba == liczba) println("Podana liczba jest równa $liczba")
    else if (drugaLiczaba %2==0) println("Podana liczba jest mniejsza od $liczba oraz jest parzysta")
    else println("Podana liczba jest mniejsza od $liczba oraz jest nieparzysta")
}