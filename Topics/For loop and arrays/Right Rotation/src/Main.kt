import java.util.Collections
fun main() {
    val n = readLine()!!.toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    val rot = readLine()!!.toInt()
    val list = array.toList()
    Collections.rotate(list, rot)
    for (i in 0..list.toIntArray().lastIndex)
        print("${list[i]} ")
}