fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    print("${inputList.first().first()} ${inputList.first().last()}\n" +
            "${inputList.last().first()} ${inputList.last().last()}")
}