fun square(number: Int): Int {
    return number * number
}

fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}