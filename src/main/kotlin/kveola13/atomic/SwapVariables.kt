package kveola13.atomic

fun swap(first : Any, second : Any): Any {
    var tempFirst = first
    var tempSecond = second
    tempFirst = tempSecond.also { tempSecond = tempFirst }
    return Pair(tempFirst, tempSecond)
}