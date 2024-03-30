package com.example.simple_intrest

fun main() {
    var choice: Int
    var number: Int

    do {
        println("Menu:")
        println("1. Find Square")
        println("2. Find Cube")
        println("3. Find Factorial")
        println("4. Exit")
        print("Enter your choice: ")

        choice = readLine()?.toIntOrNull() ?: 0

        when (choice) {
            1 -> {
                print("Enter a number: ")
                number = readLine()?.toIntOrNull() ?: 0
                println("Square of $number is: ${square(number)}")
            }
            2 -> {
                print("Enter a number: ")
                number = readLine()?.toIntOrNull() ?: 0
                println("Cube of $number is: ${cube(number)}")
            }
            3 -> {
                print("Enter a number: ")
                number = readLine()?.toIntOrNull() ?: 0
                println("Factorial of $number is: ${factorial(number)}")
            }
            4 -> println("Exiting program...")
            else -> println("Invalid choice. Please enter a number between 1 and 4.")
        }
    } while (choice != 4)
}

fun square(num: Int): Int {
    return num * num
}

fun cube(num: Int): Int {
    return num * num * num
}

fun factorial(num: Int): Long {
    var result: Long = 1
    for (i in 1..num) {
        result *= i
    }
    return result
}
