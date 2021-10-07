package main.kotlin.Tasks.in_out

fun main() {
    var a = 2
    var b = 3
    var c = 4
    println("a=$a, b=$b, c=$c")

    a=b.also { b=a }
    b=c.also { c=b }
    c=a.also { a=c }
    println("now c=$a, a=$b, b=$c")
}