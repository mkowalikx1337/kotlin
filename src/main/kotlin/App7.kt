fun main(args: Array<String>) {

//    val login: String = "admin"
//    val correctPassword: String = "haslo"
//
//    var username: String?
//    var password: String?
//
//    while (true) {
//        println("Podaj login:")
//        username = readLine()!!
//        println("Podaj hasło:")
//        password = readLine()!!
//        if(username.equals(login) && password.equals(correctPassword)) {
//            return println("Zalogowano!")
//        }
//        else {
//            println("Podałeś błędny login lub hasło!")
//        }
//    }

    zewnetrznaPetla@ for (i in 1 until 10) { // wykonuje się od 1 do 9

        println("i $i")
        for (j in 1..10) { // wykonuje się od 1 do 10
            println("j $j")
            break@zewnetrznaPetla
        }
    }
}