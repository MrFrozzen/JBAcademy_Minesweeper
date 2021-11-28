fun main() {
    val array = IntArray(readLine()!!.toInt())
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    if (readLine()!!.toInt() in array) {
        print("YES")
    } else {
        print("NO")
    }
}