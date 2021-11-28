fun getLastDigit(a: Int) = a.toString().last()

fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}