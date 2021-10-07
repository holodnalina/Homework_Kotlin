package main.kotlin.Tasks.in_out
import kotlin.math.sqrt
fun main() {
    val x1 = 12
    val x2 = 34
    val y1 = 6
    val y2 = 9
    val V = sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)).toDouble())
    println(V)
}