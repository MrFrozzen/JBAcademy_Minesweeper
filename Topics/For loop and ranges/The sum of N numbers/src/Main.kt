fun main() {
    val n = readLine()!!.toInt()
    var next = 0
    repeat(n) {
        next += readLine()!!.toInt()
    }
    print(next)
}