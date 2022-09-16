fun main(args: Array<String>) {

    /*
    var - możesz zmienić kiedy chcesz
    val - nie możesz zmienić po przypisaniu
     */

    var name = "Mateusz"
    name = "Jan"

    val age = 18


    println(name)
    println("Name: $name")

    var email: String = "test@test.com"

    var city: String
    city = "Warszawa"

    val counter: Int
    counter = 11


    var v: Number = 100
    v = 34.4

//    var v2 = 23.4
//    v2 = 100
//    tak nie można

    var a1: UByte = 1u
    var a2: UShort = 1111u
    var a3: UInt = 1111u
    var a4: ULong = 11111u

    var c = 'k'
    var cc: Char = 'i'

    val isAdult = true
    val isFast: Boolean = false

    var o1 = 1_000_000_000
    var o2 = 0xaaa12
    var o3 = 0b101010100101010
    // kotlin nie wspiera formatu ósemkowego


    /*
    var imie = "Kacper"     // String vs Char \\      var znak = 'A'
    var pi = 3.14F         //  Float vs Double \\     var pi = 3.14
    var liczba = 12L      //    Long vs Int     \\    var liczba = 12
     */
}