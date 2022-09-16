package app12.exercise

/*
Stwórz klasę 'Pies' i 'Kot'. Każda z tych klas powinna zawierać takie same pola
(waga, szybkość, głos, siła).
Następnie napisz funkcje, która zwróci zwycięzce pojedynku.
Jeden punkt przyznajesz temu zwierzęciu, które ma większą wartość konkretnego pola.
Zwycięża zwierzę, które będzie miało największą ilość punktów.

(np.. Kot.waga > Pies.waga) Kot dostaje 1pkt
 */

class Pies(var waga: Int, var szybkosc: Int, var glos: Int, var sila: Int) {


    override fun toString(): String {
        return "Pies(waga=$waga, szybkosc=$szybkosc, glos=$glos, sila=$sila)"
    }

}

class Kot(var waga: Int, var szybkosc: Int, var glos: Int, var sila: Int) {


    override fun toString(): String {
        return "Kot(waga=$waga, szybkosc=$szybkosc, glos=$glos, sila=$sila)"
    }

}

fun main(args: Array<String>) {


    val pies = Pies(5, 4, 1, 2)
    val kot = Kot(1, 2, 3, 4)

    var piesPunkty: Int = 0
    var kotPunkty: Int = 0

    // shit code, i could have done better, but i'm lazy ;/

    if (pies.waga > kot.waga) piesPunkty += 1
    else kotPunkty += 1

    if (pies.szybkosc > kot.szybkosc) piesPunkty += 1
    else kotPunkty += 1

    if (pies.glos > kot.glos) piesPunkty += 1
    else kotPunkty += 1

    if (pies.sila > kot.sila) piesPunkty += 1
    else kotPunkty += 1

    if (piesPunkty == kotPunkty) println("Remis!")
    else if (piesPunkty > kotPunkty) println("Pies wygrał!")
    else println("Kot wygrał!")

}