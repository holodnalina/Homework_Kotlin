package main.kotlin.Tasks.repeat_operator

fun main() {
    val A = 2
    val B = 8
    var sum = 0
    for (i in A..B) {
        // sum = sum+i;
        sum += i
    }

    println("Sum = $sum")
}



