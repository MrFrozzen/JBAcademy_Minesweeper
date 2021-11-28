fun main() {
    val n = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    repeat(n) {
        val next = readLine()!!.toInt()
        if (next < min) min = next
    }
    print(min)
}