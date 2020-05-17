package kveola13.intro

data class Person(val name: String, val age: Int)

fun getPeople(p1: Person, p2: Person): List<Person> {
    return listOf(p1, p2)
}

fun comparePeople(p1: Person, p2: Person): Boolean {
    return p1 == p2
}