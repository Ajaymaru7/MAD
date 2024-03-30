package com.example.simple_intrest

fun main() {
    val n = 8 // Number of rows in the pattern

    for (i in n downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
