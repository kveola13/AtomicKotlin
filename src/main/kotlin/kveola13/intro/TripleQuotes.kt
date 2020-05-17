package kveola13.intro

fun tripleQuotes(question: String, answer: String): String {
    return """#question = "$question" #answer = $answer""".trimIndent()
}

fun tripleQuotesAlt(question: String, answer: String): String {
    return """#question = "$question"
    #answer = $answer""".trimMargin("#")
}