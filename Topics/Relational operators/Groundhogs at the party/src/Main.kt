fun main() {
    val reeses = readLine()!!.toInt()
    val weekend = readLine()!!.toBoolean()
    if (reeses >= 10 && reeses <= 20 && !weekend) {
        print("true")
    } else {
        if (reeses >= 15 && reeses <= 25 && weekend) {
            print("true")
        } else {
        print("false")
        }
    }   
}
