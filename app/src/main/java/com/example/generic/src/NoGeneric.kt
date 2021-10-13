package com.example.generic.src

class Bangunan (val data : Any)

fun main() {
    val dataString = Bangunan("Kota Tua")
    val valueString : String = dataString.data as String

    val dataInt = Bangunan(3)
    val valueInt : Int = dataInt.data as Int

    println(valueString)
    println(valueInt)
}