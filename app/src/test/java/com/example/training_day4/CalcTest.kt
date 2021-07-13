package com.example.training_day4

import junit.framework.TestCase

class CalcTest: TestCase() {
    fun add() {
        var cal = Calc();
        var exp =  2
        var actual =  cal.add(10, 20)
        assertEquals(exp, actual)
    }

}