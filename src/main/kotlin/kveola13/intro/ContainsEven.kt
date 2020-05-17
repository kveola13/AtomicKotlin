package kveola13.intro

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { c -> c % 2 == 0 }