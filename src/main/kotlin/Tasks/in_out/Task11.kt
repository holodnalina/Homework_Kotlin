package main.kotlin.Tasks.in_out
import kotlin.math.sqrt
fun main () {
    val a = 25
    val b = 36
    val c: Double = sqrt(((a*a)+(b*b)).toDouble())
    val p = a+b+c

    println(c)
    println(p)


}