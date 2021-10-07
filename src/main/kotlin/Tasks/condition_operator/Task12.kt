package main.kotlin.Tasks.condition_operator

fun main() {
    val n = 1992
    if (n % 4 == 0) {
        println("Високосний")
    } else if (n % 100 == 0 && n % 400 !== 0) {
        println("Високосний")
    } else {
        println("Не високосний")
    }
}