package main.kotlin.Tasks.repeat_operator
import kotlin.math.pow
fun main() {
    val A = 4.toDouble()
    val N = 9
    for (i in 1..N) {
        println(A.pow(i).toInt())
    }
}