fun main() {
    val str = readLine()!!.toString()
    val n = readLine()!!.toInt()
    print("Symbol # $n of the string \"$str\" is '${str[n - 1]}'")
}