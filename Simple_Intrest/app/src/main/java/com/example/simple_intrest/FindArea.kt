package com.example.simple_intrest

import java.util.Scanner
import kotlin.math.PI

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter Radius of the Cylinder(in cm): ")
    val radius = scanner.nextDouble()

    println("Enter Height of the Cylinder(in cm): ")
    val height = scanner.nextDouble()

    val baseArea = PI * radius * radius
    val lateralArea = 2 * PI * radius * height
    val totalArea = baseArea + lateralArea

    println("Total Surface Area of the cylinder: ${totalArea} cm")
}