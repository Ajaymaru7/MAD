package com.example.simple_intrest

import java.sql.DriverManager.println
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // User Input
    println("Enter a number: ")
    val number = scanner.nextDouble()

    // Check number sign
    when {
        number > 0 -> println("The number is positive.")
        number < 0 -> println("The number is negative.")
        else -> println("The number is zero.")
    }
}
