package com.example.training_day4.data_struct

class Mutable_lists {
}

fun main() {
    val dig = listOf<Int>(100, 200, 300)
    val num = mutableListOf<Int>(1, 2, 3, 4)
    println("Add  at 4 pos ${num.add(4, 6)}")
    println("${num.addAll(dig)}")

//    println("${num.reverse()}")
    println("$num")
    println("${num.reverse()}")
    println("$num")
    num.add(2, 30)
    println("${num.sort()}")
    println("$num")
    println("Is number list empty - ${num.isEmpty()}")


    for(i in 0..(num.size-1)){
        println("${num[i]}")
    }

    var index = 0
    while (index < num.size){
        println("${num[index]}")
        index++
    }
}