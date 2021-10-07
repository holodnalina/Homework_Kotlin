package main.kotlin.Tasks.array

fun main() {
    val N = 10
    val numbers: IntArray = IntArray(size = N){i -> i+1 }
    var firstElement = numbers[0]

    for (number in numbers){
        if(firstElement > N){
            firstElement = number
        println("Первое число в массиве: $firstElement")}


    }


    }
