fun main() {
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    print("${inputArray.first().first()} ${inputArray.first().last()}\n" +
            "${inputArray.last().first()} ${inputArray.last().last()}")
}