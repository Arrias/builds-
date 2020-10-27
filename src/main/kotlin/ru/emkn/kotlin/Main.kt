package ru.emkn.kotlin

fun main() {
    val stream = Thread.currentThread().contextClassLoader?.getResourceAsStream("helpfile.txt")!!
    var ch = 0
    var answer = ""
    while (stream.read().also { ch = it } != -1) {
        answer += ch.toChar()
    }
    print(answer)
}