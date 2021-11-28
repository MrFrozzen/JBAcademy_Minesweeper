fun main() {
    val days = readLine()!!.toInt()
    val food = readLine()!!.toInt()
    val flight = readLine()!!.toInt()
    val hotel = readLine()!!.toInt()
    print(days * food + (days - 1) * hotel + 2 * flight)
}