package main.kotlin.Tasks.condition_operator

fun main() {
    val x = 9
    if (x<=0) {
        println(-x)
    }
    else if (0<x && x<2 ) {
        println(x*x)
    }
    else if (x>=2) {
        println(4)
    }
}