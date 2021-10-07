package main.kotlin.Tasks.array

fun main() {
    val n = 10
    var numbers: IntArray = IntRange(1, n).toList().toIntArray()
    var reversedArray = numbers.reversedArray()

    println("${reversedArray.contentToString()}")
}