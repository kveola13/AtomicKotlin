package com.kveola13.intro.intro

import kveola13.intro.Person
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PersonKtTest {

    @Test
    fun getPeople() {
        val p1 = Person("Alice", 29)
        val p2 = Person("Bob", 31)
        assertEquals(listOf(p1, p2), kveola13.intro.getPeople(p1, p2))
    }

    @Test
    fun comparePeople() {
        val p1 = Person("Alice", 29)
        val p2 = Person("Alice", 29)
        assertTrue(kveola13.intro.comparePeople(p1, p2))
    }
}