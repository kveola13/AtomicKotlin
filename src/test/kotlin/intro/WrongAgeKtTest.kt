package com.kveola13.intro.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WrongAgeKtTest {

    @Test
    fun checkAge() {
        assertEquals("Congrats! Next year you'll be 11.", kveola13.intro.checkAge(10))
    }
}