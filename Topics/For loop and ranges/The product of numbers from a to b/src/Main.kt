fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var results = 1L
    for (i in a until b) {
        results *= i
    }
    print(results)
}