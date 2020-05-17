package kveola13.atomic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReturnStringKtTest {

    @Test
    fun returnStringTest() {
        assertEquals("test", returnString("test"))
    }

    @Test
    fun returnStringWithLineEndingTest(){
        assertEquals("Hello\nThere", returnStringWithLineEnding("Hello","There"))
    }
}