fun main(args: Array<String>) {


    var czySieRusza: String
    var czyPowinnoSieRuszac: String

//    czySieRusza = readLine()!!.toLowerCase()      // mowimy ze to na 100% nie jest null
//    czySieRusza = readLine()?.toLowerCase()
    println("Czy coś się rusza?")
    czySieRusza = readLine().toString().toLowerCase()

    if (czySieRusza == "tak") {
        println("A powinno się ruszać?")
        czyPowinnoSieRuszac = readLine().toString().toLowerCase()
        if (czyPowinnoSieRuszac == "nie") {
            println("Użyj taśmy. Po problemie! Idź na browara.")
        } else {
            println("To nie było problemu!")
        }
    } else {
        println("A powinno się ruszać?")
        czyPowinnoSieRuszac = readLine().toString().toLowerCase()
        if (czyPowinnoSieRuszac == "tak") {
            println("Użyj WD-40. Po problemie! Idź na browara.")
        } else {
            println("To nie ma problemu!")
        }
    }
}