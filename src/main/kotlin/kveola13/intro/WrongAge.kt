package kveola13.intro

import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?): Nothing{
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) :String {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    return("Congrats! Next year you'll be ${age + 1}.")
}