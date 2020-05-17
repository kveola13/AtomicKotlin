package kveola13.intro

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")