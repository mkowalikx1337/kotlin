package exercises


fun main() {

    var arr = intArrayOf()

    for (i in 1..20) {
        if (i % 2 == 0) {
            arr = addElement(arr, i)
        }
    }

    println("Elements in Array: ")
    for (element in arr) {
        print("$element")
    }

}

fun addElement(arr: IntArray, element: Int): IntArray {
    val mutableArray = arr.toMutableList()
    mutableArray.add(element)
    return mutableArray.toIntArray()
}
