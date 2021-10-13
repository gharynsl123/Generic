package com.example.generic.src

class GedungBaru<DIMAS>(val data : DIMAS)

fun main() {
    val dataString = GedungBaru("Apa ya")
    val valueStrin = dataString.data
    println(valueStrin)

    val dataInt = GedungBaru(0)
    val valueint = dataInt.data
    println(valueint)
}