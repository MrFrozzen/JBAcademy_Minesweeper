fun main() {
    val n = readLine()!!.toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    val max = array.indices.maxByOrNull { array[it] }
    println(max)
}