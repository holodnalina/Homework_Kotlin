package main.kotlin.Tasks.repeat_operator

fun main() {
    var N = 10
    var f1 = 1
    var f2 = 1
    if (N>f2) {
        var fk = f2
        f2 = f1 + f2
        f1 = fk
        if (N == f2) {
            println("True")
        }
        else {
            println("False")
        }
    }
}