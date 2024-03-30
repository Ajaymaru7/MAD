package com.example.simple_intrest

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter first number: ")
    var firstNumber = scanner.nextInt()

    println("Enter second number: ")
    var secondNumber = scanner.nextInt()


    println("Before swapping:")
    println("First number: $firstNumber")
    println("Second number: $secondNumber")

    firstNumber = firstNumber + secondNumber
    secondNumber = firstNumber - secondNumber
    firstNumber = firstNumber - secondNumber

    println("\nAfter swapping:")
    println("First number: $firstNumber")
    println("Second number: $secondNumber")
}
