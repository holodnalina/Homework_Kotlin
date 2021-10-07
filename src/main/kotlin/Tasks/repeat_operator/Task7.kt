package main.kotlin.Tasks.repeat_operator

fun main() {
    var N = 9
    var K = 2
    var dil = 0
   while ((N-K)>=0) {
       N=N-K
       dil = dil+1
   }
    println(dil)
    println(N)
    println(N%K) //для перевірки
}