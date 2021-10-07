package main.kotlin.Tasks.string

fun main() {
    val chars = listOf('A', 'B', 'C', 'D')
    val lowercaseChar = chars.map { it.lowercaseChar() }

    println(lowercaseChar)

}
