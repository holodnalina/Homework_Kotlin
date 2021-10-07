package main.kotlin.Tasks.in_out

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val S = 452
    val R: Double = sqrt(S/ PI.toDouble())
    val L=2* PI*R
    println(R)
    println(L)
}