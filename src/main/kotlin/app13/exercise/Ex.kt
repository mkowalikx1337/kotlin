package app13.exercise

//Klasa Zwierzak, po której dziedziczą wspólne pola klasy Pies i Kot
open class Zwierzak(imie: String,waga: Int, szybkosc: Int, glos: Int, sila: Int)
{
    var imie = imie
    var waga = waga
    var szybkosc = szybkosc
    var glos = glos
    var sila = sila
}

//Klasa Kot
class Kot(imie: String, waga: Int, szybkosc: Int, glos: Int, sila: Int) : Zwierzak(imie, waga, szybkosc, glos, sila)

//Klasa Pies
class Pies(imie: String, waga: Int, szybkosc: Int, glos: Int, sila: Int) : Zwierzak(imie, waga, szybkosc, glos, sila)

//Funkcja zwracająca zwyciezce, zwraca obiekt typu Zwierzak
fun ktoWygra(pies: Pies, kot: Kot): Zwierzak?
{
    var punktyPsa = 0
    var punktyKota = 0

    if(pies.waga > kot.waga) punktyPsa++
    else if(pies.waga == kot.waga)
    {
        punktyPsa++
        punktyKota++
    }
    else punktyKota++

    if(pies.sila > kot.sila) punktyPsa++
    else if(pies.sila == kot.sila)
    {
        punktyPsa++
        punktyKota++
    }
    else punktyKota++

    if(pies.szybkosc > kot.szybkosc) punktyPsa++
    else if(pies.szybkosc == kot.szybkosc)
    {
        punktyPsa++
        punktyKota++
    }
    else punktyKota++

    if(pies.glos > kot.glos) punktyPsa++
    else if(pies.glos == kot.glos)
    {
        punktyPsa++
        punktyKota++
    }
    else punktyKota++

    if(punktyKota > punktyPsa) return kot
    else if(punktyPsa > punktyKota) return pies
    else return null
}



fun main(args: Array<String>)
{

    var Azor = Pies("Azor",1,22,1,15) //Instancja klasy Pies
    var Mruczek = Kot("Mruczek",1,21,4,55) //Instancja klasy Kot

    if(ktoWygra(Azor,Mruczek) is Pies) println("Wygrał ${Azor.imie}") //Sprawdzenie czy funkcja zwróciła typ Pies
    else if(ktoWygra(Azor,Mruczek) is Kot) println("Wygrał ${Mruczek.imie}") //Sprawdzenie czy funkcja zwróciła typ Kot
    else println("Mamy remis!") //Sprawdzenie czy funkcja zwróciła typ null

}