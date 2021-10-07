package main.kotlin.Tasks.repeat_operator

fun main() {
    val n = 5
    var multiply = 1
    for (i in 1..n) {

        multiply *= i
    }

    println("Multiply = $multiply")
}