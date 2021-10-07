package main.kotlin.Tasks.array

fun main(args : Array<String>) {
    var num = 10
    val m = 5
    val n = 4

    var twoDArray = Array(m, {IntArray(n)})
    for(i in 0..twoDArray.size - 1) {
        var rowArray = IntArray(n)
        for(j in 0..rowArray.size - 1) {
            rowArray[j] = (num++)*10
        }
        twoDArray[i] = rowArray
    }

    for(row in twoDArray) {
        for(j in row) {
            print(j)
            print(" ")
        }
        println("")
    }

}