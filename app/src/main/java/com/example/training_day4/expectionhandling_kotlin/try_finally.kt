package com.example.training_day4.expectionhandling_kotlin

import java.lang.ArithmeticException

class try_finally {
}

fun main() {
    val n = intArrayOf(2,4,6,8,12,16,18)
    val d = intArrayOf(2, 0, 4, 5, 6)

    try {
        for(i in n.indices){
            try {
                println(n[i].toString()+"/"+d[i]+" is "+n[i]/d[i])
            } catch (e: ArithmeticException) {
                println("Cannot divide by 0")
            }

        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Array out of index")
    }
    finally {
        println("In finally")
    }
}