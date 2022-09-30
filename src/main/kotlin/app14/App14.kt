package app14

class MojaPublicznaKlasa {

    var imie: String = "Moje_imie"
}

private class MojaPrywatnaKlasa() {

    var imie: String = "Moje_imie"

}

open class KlasaChroniona() {

    protected var numer_licencji = "007"
}

class TajneDane(): KlasaChroniona() {
    var numer_lic = numer_licencji
}

internal class KlasaTajemnica() {

}

fun main(args: Array<String>) {

    var inst = MojaPrywatnaKlasa()
    var inst1 = MojaPublicznaKlasa()


    var dostepDoDanych = KlasaChroniona()

    var dostepDoDanych2 = TajneDane()
    dostepDoDanych2.numer_lic
}