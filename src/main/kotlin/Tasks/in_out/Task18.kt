package main.kotlin.Tasks.in_out

fun main( ) {
    var a = 8
    var b = 9
    println("a=$a and b=$b")

    val c = a
    a = b
    b = c
    println("now a=$a and b=$b")
}