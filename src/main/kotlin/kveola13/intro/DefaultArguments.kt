package kveola13.intro

fun defaultArguments(name: String, number: Int = 0, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun useArguments() = listOf(
    defaultArguments("Ola"),
    defaultArguments("Olaf", 26),
    defaultArguments("Olav", toUpperCase = true),
    defaultArguments("Oglaf", 28, toUpperCase = true)
)