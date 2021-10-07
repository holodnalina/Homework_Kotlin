package main.kotlin.Tasks.string

fun main() {
    val S = 10
    val C = 4
    val intArray = IntArray(S){i -> (i*2)+4}
    println(intArray.joinToString())
}