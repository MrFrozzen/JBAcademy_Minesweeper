fun main() {
    val array = IntArray(readLine()!!.toInt())
    var sum = 0
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    for (i in 0..array.lastIndex) {
        if (array[i] == m) sum++
    }
    print(sum)
}