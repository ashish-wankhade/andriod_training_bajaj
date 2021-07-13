package com.example.training_day4.data_struct

class Lists {
}

fun main() {
    val num: List<Int> = listOf(1, 2, 3, 4, 5, 7)
    println("List is ${num[num.size-1]}")
    println("List is ${num[3]}")
    println("List contains 2 ${num.contains(2)}")
}