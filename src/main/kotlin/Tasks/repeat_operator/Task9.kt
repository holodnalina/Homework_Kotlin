package main.kotlin.Tasks.repeat_operator

fun main() {
    var P = 12.25F
    var Summ=1000
    var K=1
    while (Summ<1100) {
        K = K + 1
        Summ = Summ * (P.toInt() / 100 + K)


    }
    println(K)
    println(Summ)
}