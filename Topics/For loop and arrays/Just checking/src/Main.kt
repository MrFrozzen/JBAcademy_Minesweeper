fun main() {
    val n = readLine()!!.toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    val num = readLine()!!.split(" ").map { it.toInt() }
        if (num[0] in array && num[1] in array) {
            print("YES")
        } else {
            print("NO")
        }
}