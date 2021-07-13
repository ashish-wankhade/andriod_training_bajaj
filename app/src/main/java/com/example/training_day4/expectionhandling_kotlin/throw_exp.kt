package com.example.training_day4.expectionhandling_kotlin

import java.lang.ArithmeticException

class throw_exp {
}

fun main() {
    try {
        println(age(11))
    } catch (e: Exception) {
        println(e.message)
    }
    println("Validation Done")
}

fun age(a: Int): String{
    if(a<18)
        return throw ArithmeticException("underage")
    else
        return "validated"
}