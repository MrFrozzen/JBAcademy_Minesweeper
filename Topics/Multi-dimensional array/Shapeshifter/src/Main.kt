fun main() {
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    val out = arrayOf(
        inputArray.last(),
        inputArray.first()
    )
    println(out.contentDeepToString())
}