fun main() {
    val numbers = IntArray(readLine()!!.toInt())
    var sum = 0
    for (i in 0..numbers.lastIndex) {
        numbers[i] = readLine()!!.toInt()
    }
    for (i in 1 until numbers.lastIndex) {
        if (numbers[i + 1] - numbers[i] == 1 && numbers[i] - numbers[i - 1] == 1) sum++
    }
    print(sum)
}