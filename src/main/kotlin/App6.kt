fun main(args: Array<String>) {

//    for (i in 0..10){
//        println("Test forIncrement: $i")
//    }
//
//    for (i in 5 downTo 0) {
//        println("Test forDecrement: $i")
//    }
//
//    for (i in 10 downTo 0 step 2) {
//        println("Test forDecrement (i=i-2): $i")
//    }


    print("Ile czasu chcesz odmierzyć: ")
    var time: Int = readLine()!!.toInt()

    for (i in time downTo 0) {
        if (i != 0) {
            println(i)
            Thread.sleep(1000)
        }
        else {
            println("Koniec czasu!")
        }
    }

}