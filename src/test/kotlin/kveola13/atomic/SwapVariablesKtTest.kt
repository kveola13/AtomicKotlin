package kveola13.atomic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SwapVariablesKtTest {

    @Test
    fun swapTest() {
        val pair = Pair("Yes","No")
        assertEquals(pair, swap("No", "Yes"))
    }
}