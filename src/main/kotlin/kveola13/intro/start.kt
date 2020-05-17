package kveola13.intro

fun start(): String {
    return "Hello world"
}

fun startWithLineSeparation(): String {
    return "Hello,\nKotlin!"
}

fun printName(): String? {
    val hello: String? = null
    val name = "Ola"
    if (hello == null) return name
    return hello
}

fun startReturn(): String = "OK"