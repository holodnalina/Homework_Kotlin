package main.kotlin.Tasks.array

fun main() {
    val N = 10
    val intArray = IntArray(N){i -> i*2}
    println(intArray.joinToString())
}