package com.example.student_marksheet

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enrollment Number: ")
    val enrollmentNumber = scanner.nextInt()

    println("Student Name: ")
    val studentName = scanner.nextLine()

    val marks = IntArray(5)
    for (i in marks.indices){
        println("Enter Marks ${i + 1}: ")
        marks[i] = scanner.nextInt()
    }
    val totalMarks = marks.sum()
    val percentage = totalMarks / (marks.size * 100.0) * 100

    println("EnrollmentNumber: $enrollmentNumber")
    println("Student Name: $studentName")
    println("Marks:")
    for (i in marks.indices) {
        println("Subject ${i + 1}: ${marks[i]}")
    }
    println("Total Marks: $totalMarks")
    println("Percentage: $percentage%")
}