package com.example.simple_intrest

import kotlin.math.pow

fun main() {
    print("Enter a number: ")
    var number = readLine()?.toIntOrNull() ?: 0
    var originalNumber = number
    var result = 0
    var power = getNumberOfDigits(number)

    do {
        val digit = number % 10
        result += digit.toDouble().pow(power).toInt()
        number /= 10
    } while (number != 0)

    if (result == originalNumber) {
        println("$originalNumber is an Armstrong number.")
    } else {
        println("$originalNumber is not an Armstrong number.")
    }
}

fun getNumberOfDigits(number: Int): Int {
    var num = number
    var count = 0
    while (num != 0) {
        num /= 10
        count++
    }
    return count
}
