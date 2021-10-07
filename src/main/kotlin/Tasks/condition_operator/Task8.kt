package main.kotlin.Tasks.condition_operator

fun main() {
    val a = 8
    val b = 13
    val c = 56
//abc bac bca cba cab acb
    if (a>b && b>c) {
        println(b)
    }
    else if (b>a && a>c) {
        println(a)
    }
    else if (b>c && c>a) {
        println(c)
    }
    else if (c>b && b>a) {
        println(b)
    }
    else if (c>a && a>b) {
        println(a)
    }
    else {
        println(c)
    }
}