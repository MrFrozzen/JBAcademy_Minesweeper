fun main() {
    var n = readLine()!!.toInt()
    var sum = 0
    while (n != 0) {
        sum += n % 10
        n /= 10
    }
    print(sum)
}