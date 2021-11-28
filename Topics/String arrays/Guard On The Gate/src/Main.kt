fun main() {
    var backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()  
    backFromTheWall += returnedWatchman
    print(backFromTheWall.joinToString())

}