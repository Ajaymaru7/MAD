package com.example.simple_intrest

import java.util.Scanner

fun main() {
    println("Enter a string:")
    val inputString = readLine()?.toLowerCase() ?: ""
    val vowelCount = countVowels(inputString)
    println("Number of vowels in the string: $vowelCount")
}

fun countVowels(input: String): Int {
    var count = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    for (char in input) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
