package com.example.simple_intrest

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // User Input
    println("Enter the starting number of the range: ")
    val start = scanner.nextInt()

    println("Enter the ending number of the range: ")
    val end = scanner.nextInt()

    // Find even and odd numbers
    println("Even numbers:")
    for (i in start..end) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    println("\nOdd numbers:")
    for (i in start..end) {
        if (i % 2 != 0) {
            print("$i ")
        }
    }
}
