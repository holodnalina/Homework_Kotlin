package main.kotlin.Tasks.array
fun main() {
    val n = 10
    var numbers: IntArray = IntRange(1, n).step(2).toList().toIntArray()


    println("${numbers.contentToString()}")

}