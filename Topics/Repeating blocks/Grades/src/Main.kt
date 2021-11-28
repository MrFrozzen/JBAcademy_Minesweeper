fun main() {
    val n = readLine()!!.toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(n) {
        val next = readLine()!!.toInt()
        if (next == 2) d++
        if (next == 3) c++
        if (next == 4) b++
        if (next == 5) a++
    }
    print("$d $c $b $a")
}