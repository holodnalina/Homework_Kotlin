package main.kotlin.Tasks.repeat_operator

fun main() {
    var N = 5
    var K = 1
    var sum = 1
    while (sum<N) {
        K=K+1
        sum=sum+K
    }
    println(K)
    println(sum)
}