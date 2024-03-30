package com.example.simple_intrest

    fun main() {
        val numbers = mutableListOf<Int>()

        println("Enter 5 numbers:")
        for (i in 1..5) {
            print("Number $i: ")
            val num = readLine()?.toIntOrNull()
            if (num != null) {
                numbers.add(num)
            } else {
                println("Invalid input. Please enter a valid number.")
            }
        }

        val sum = numbers.sum()

        val average = if (numbers.isNotEmpty()) {
            sum.toDouble() / numbers.size
        } else {
            0.0
        }

        println("Sum of the numbers: $sum")
        println("Average of the numbers: $average")
    }
