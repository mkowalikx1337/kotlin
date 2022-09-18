package app13

open class Postac(var imie: String) {

    var hp = 100
    var sila = 10
    var inteligencja = 10
    var kondycja = 10
    var zrecznosc = 10
    var bystrosc = 10

    fun atakuj(postac: Postac) {
        println("Zadałeś obrażenia przeciwnikowi ${postac.imie} równe $sila")
    }

    fun uleczSie() {

        if (hp >= 70 && hp <= 100) {
            hp = 100
            println("Przywróciłeś sobie 30HP")
        } else if (hp < 70) {
            hp += 30
            println("Przywróciłeś sobie 30HP")
        } else println("Nie możesz się uleczyć, ponieważ posiadasz pełne zdrowie!")
    }
}

class Mag(imie: String) : Postac(imie) {

    var mana = 100

    fun rzucZaklecie(postac: Postac) {
        mana -= 20
        println("Zadałeś obrażenia magiczne przeciwnikowi ${postac.imie} równe ${inteligencja * 2}")
        postac.hp -= inteligencja*2
    }

}

class Wojownik(imie: String) : Postac(imie) {

    var wytrzymalosc = 100

    fun udzerzMieczem(postac: Postac) {
        wytrzymalosc -= 20
        println("Zadałeś obrażenia fizyczne przeciwnikowi ${postac.imie} równe ${sila * 2}")
        postac.hp -= sila*2
    }
}


fun main(args: Array<String>) {

    var Malzachar = Mag("Malzachar")
    var Artur = Wojownik("Artur")

    Malzachar.rzucZaklecie(Artur)
    println("HP ${Artur.imie} po ataku ${Malzachar.imie} wynosi ${Artur.hp}")
}