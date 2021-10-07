package main.kotlin.`umovniy operator`

fun main () {
    var n = 8

    if (n>0)
    {
        n = n +1
    }
    else if (n<0) {
       n = n -2
    }
    else if (n==0) {
        n = 10
    }
    println("$n")
}