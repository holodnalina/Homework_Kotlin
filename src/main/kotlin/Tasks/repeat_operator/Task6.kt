package main.kotlin.Tasks.repeat_operator

fun main() {
    val N = 8
    var A1 = 1
    var A2 = 2
    var A3 = 3

    println(A1)
    println(A2)
    println(A3)

    for (i in 4..N) {

        var K = A3
        A3 = A3+A2-2*A1
        A1 = A2
        A2 = K
println(A3)
    }

}