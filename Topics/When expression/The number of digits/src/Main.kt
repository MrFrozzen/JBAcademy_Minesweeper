fun main() {
    when (readLine()!!.toInt()) {
        in 0..9 -> print("1")
        in 10..99 -> print("2")
        in 100..999 -> print("3")
        else -> print("4")
    }
}
