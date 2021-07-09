package com.example.training_day4.expectionhandling_kotlin

class ExceptionHandling_day5 {
}

fun main() {
    try {
        var data = 100/0
        println(data)
    }
    catch (e: Exception) {
        println(e)
    }
    println("Exception Handled")

}