fun main() {
    // Do not touch code below
    var inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    val out = arrayOf(
        inputList.last(),
        inputList.first()
    )
    println(out.contentDeepToString())
}