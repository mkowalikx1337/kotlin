fun main(args: Array<String>) {

    /*
    byteArrayOf[podaj elementy]
    shortArrayOf[podaj elementy]
    intArrayOf[podaj elementy]
    longArrayOf[podaj elementy]

    booleanArrayOf[podaj elementy]

    floatArrayOf[podaj elementy]
    doubleArrayOf[podaj elementy]

    arrayOf[podaj elementy]

    arrayOfNulls<Typ>[ilosc elementow]
     */


    var tablica: Array<String> = arrayOf("żółw", "mars", "rower", "marvel")

    for (slowo in tablica) {

        var dlugoscCiagu = slowo.length

        while (dlugoscCiagu > 0) {
            print(slowo[dlugoscCiagu - 1])
            dlugoscCiagu--
        }
        println()
    }


}