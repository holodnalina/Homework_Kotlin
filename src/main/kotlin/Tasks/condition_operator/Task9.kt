package main.kotlin.Tasks.condition_operator

fun main() {
    val a = 6
    val b = 9
    val c = 12
    if (a<b && a<c) {
        println (b+c)
    }
    else if (b<c && b<a) {
        println(c+a)
    }
    else {
        println(a+b)
    }
}