package com.example.simple_intrest

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var choice: Int

    do {
        println("Menu:")
        println("1. Find Area of Circle")
        println("2. Find Area of Square")
        println("3. Find Area of Triangle")
        println("4. Find Area of Cylinder")
        println("5. Exit")
        print("Enter your choice: ")

        choice = readLine()?.toIntOrNull() ?: 0

        when (choice) {
            1 -> {
                print("Enter the radius of the circle: ")
                val radius = readLine()?.toDoubleOrNull() ?: 0.0
                println("Area of the circle: ${areaOfCircle(radius)}")
            }
            2 -> {
                print("Enter the side length of the square: ")
                val sideLength = readLine()?.toDoubleOrNull() ?: 0.0
                println("Area of the square: ${areaOfSquare(sideLength)}")
            }
            3 -> {
                print("Enter the base of the triangle: ")
                val base = readLine()?.toDoubleOrNull() ?: 0.0
                print("Enter the height of the triangle: ")
                val height = readLine()?.toDoubleOrNull() ?: 0.0
                println("Area of the triangle: ${areaOfTriangle(base, height)}")
            }
            4 -> {
                print("Enter the radius of the base of the cylinder: ")
                val radius = readLine()?.toDoubleOrNull() ?: 0.0
                print("Enter the height of the cylinder: ")
                val height = readLine()?.toDoubleOrNull() ?: 0.0
                println("Area of the cylinder: ${areaOfCylinder(radius, height)}")
            }
            5 -> println("Exiting program...")
            else -> println("Invalid choice. Please enter a number between 1 and 5.")
        }
    } while (choice != 5)
}

fun areaOfCircle(radius: Double): Double {
    return PI * radius.pow(2)
}

fun areaOfSquare(sideLength: Double): Double {
    return sideLength.pow(2)
}

fun areaOfTriangle(base: Double, height: Double): Double {
    return 0.5 * base * height
}

fun areaOfCylinder(radius: Double, height: Double): Double {
    val baseArea = PI * radius.pow(2)
    val lateralArea = 2 * PI * radius * height
    return 2 * baseArea + lateralArea
}
