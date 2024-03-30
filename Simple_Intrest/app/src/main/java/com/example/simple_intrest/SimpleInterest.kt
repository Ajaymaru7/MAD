package com.example.simple_intrest

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter Principal Amount: ")
    val principal = scanner.nextDouble()

    println("Enter Rate of Intrest(in %): ")
    val rate = scanner.nextDouble() / 100

    println("Enter Time Period(in Year): ")
    val time = scanner.nextDouble()

    val simpleInterest = principal * rate * time

    println("SimpleInterest: Rs. $simpleInterest%")
}