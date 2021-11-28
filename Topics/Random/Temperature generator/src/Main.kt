import kotlin.random.Random

fun generateTemperature(seed: Int): String {
    val gen = Random(seed)
    return List(7) { gen.nextInt(20, 31) }.joinToString(" ")
}