fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()
    if (a > h) {
        print("Deficiency")
    } else if (h in a..b) {
        print("Normal")
    } else {
        print("Excess")
    }
}