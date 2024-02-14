package org.example
fun main() {
    while (true) {
        println("Please Enter your name: ")
        var name: String = readln()

        println("Please Enter your Age: ")
        var age = readlnOrNull()?.toInt() ?: 0


        var age1 = when {

            age in 1..7 -> "you are an Under Age."
            age in 18..30 -> "you are a Young Adult"
            age in 31..59 -> " you are an Adult."
            age >= 60 -> "you are a Senior."
            else -> "Invalid age."
        }
        println("Hello $name you're $age years old and $age1")
    }
}