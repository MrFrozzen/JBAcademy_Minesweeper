import java.util.*

fun main() {
    val numbers = IntArray(readLine()!!.toInt())
    for (i in 0..numbers.lastIndex) {
        numbers[i] = readLine()!!.toInt()
    }
    val list = numbers.toList()
    Collections.rotate(list, 1)
    for (i in 0..list.toIntArray().lastIndex)
    print("${list[i]} ")
}