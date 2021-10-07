package main.kotlin.Tasks.repeat_operator

fun main() {
    var A = 4
    var B = 9
    while (A!=0 && B!=0) {
        if (A >= B) {
            A = A % B
        }
        else {
            B = B % A
            println(A +B)
        }
    }
}