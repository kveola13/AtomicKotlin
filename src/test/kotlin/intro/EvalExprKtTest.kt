package com.kveola13.intro.intro

import com.kveola13.intro.Num
import com.kveola13.intro.Sum
import com.kveola13.intro.eval
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EvalExprKtTest {

    @Test
    fun evalNumTest() {
        assertEquals(2, eval(Num(2)))
    }

    @Test
    fun evalSumTest() {
        assertEquals(4,
            eval(
                Sum(
                    Num(2), Num(2)
                )
            )
        )
    }
}