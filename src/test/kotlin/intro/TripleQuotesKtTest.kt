package com.kveola13.intro.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TripleQuotesKtTest {

    @Test
    fun tripleQuotes() {
        assertEquals("#question = \"who?\" #answer = yes",
            kveola13.intro.tripleQuotes("who?", "yes")
        )
    }

    @Test
    fun tripleQuotesAlt() {
        assertEquals("question = \"who?\"\nanswer = yes",
            kveola13.intro.tripleQuotesAlt("who?", "yes")
        )
    }
}