package com.example.simple_intrest

fun main() {

    val number1 = getNumber("Enter the first number: ")
    val number2 = getNumber("Enter the second number: ")
    val number3 = getNumber("Enter the third number: ")

    val biggest = maxOf(number1, number2, number3)
    val smallest = minOf(number1, number2, number3)

    println("The biggest number is: $biggest")
    println("The smallest number is: $smallest")
}

fun getNumber(message: String): Float {
    print(message)
    return readLine()?.toFloatOrNull() ?: 0f
}
