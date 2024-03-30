package com.example.simple_intrest

fun main() {

    val immutableVariable: Int = 55

    println("Immutable Variable: $immutableVariable")

    var mutableVariable: Int = 60
    println("Mutable Variable (Before Modification): $mutableVariable")

    mutableVariable = 90

    println("Mutable Variable (After Modification): $mutableVariable")
}
