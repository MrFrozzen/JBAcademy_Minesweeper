fun main() {
    val (a, b, n) = Array(3) { readLine()!!.toInt() }
    var x = 0
    for (i in a..b) {
        if (i % n == 0) x++
    }
    print(x)
}