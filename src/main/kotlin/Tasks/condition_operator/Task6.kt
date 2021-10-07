package main.kotlin.Tasks.condition_operator

fun main() {
    var a = 5
    var b = 6

    if (a != b) {
        a=a+b
        b=a
}
    else if (a == b) {
        a=0
        b=0
    }
    println(a)
    println(b)
}