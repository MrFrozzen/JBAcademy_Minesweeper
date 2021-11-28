fun main() {
    var class1 = readLine()!!.toInt()
    var class2 = readLine()!!.toInt()
    var class3 = readLine()!!.toInt()
    if (class1 % 2 > 0) {
        class1 = class1 / 2 + 1
    } else {
        class1 /= 2
    }
    if (class2 % 2 > 0) {
        class2 = class2 / 2 + 1
    } else {
        class2 /= 2
    }
    if (class3 % 2 > 0) {
        class3 = class3 / 2 + 1
    } else {
        class3 /= 2
    }
    print(class1 + class2 + class3)
}