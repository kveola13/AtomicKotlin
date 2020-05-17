package com.kveola13.intro.intro

import kveola13.intro.printName
import kveola13.intro.start
import kveola13.intro.startReturn
import kveola13.intro.startWithLineSeparation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

internal class StartKtTest {

    @Test
    fun startTest() {
        assertEquals("Hello world", start())
    }

    @Test
    fun startFails() {
        assertNotEquals("Helloworld", start())
    }

    @Test
    fun testLineSeparation() {
        assertEquals("Hello,\nKotlin!", startWithLineSeparation())
    }

    @Test
    fun testPrintName() {
        assertEquals("Ola", printName())
    }

    @Test
    fun testStartReturn() {
        assertEquals("OK", startReturn())
    }
}