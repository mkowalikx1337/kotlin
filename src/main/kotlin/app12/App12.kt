package app12

fun whoWins(dog1: App12, dog2: App12) {

    if (dog1.voice > dog2.voice) {
        println("Dog number 1 wins!")
    }
    else if (dog1.voice == dog2.voice) {
        println("Draw!")
    }
    else {
        println("Dog number 2 wins!")
    }

}

class App12(weight: Int, voice: Int) {

    var weight = weight
    var voice = voice

    fun giveVoice() {
        println("Woof! Woof!")
    }

//    override fun toString(): String {
//        return "App12(weight=$weight, voice=$voice)"
//    }


}

fun main(args: Array<String>) {

    var azor = App12(1, 1)
    var roza = App12(5, 5)
//    azor.weight
//    azor.voice
//    azor.giveVoice()
    whoWins(azor, roza)


}