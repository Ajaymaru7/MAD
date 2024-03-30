package com.example.simple_intrest

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter Number: ")
    val number = scanner.nextInt()

    println("Multiplication Table of $number:")
    for (i in 1..10) {
        val product = number * i
        println("$number * $i = $product")
    }
}