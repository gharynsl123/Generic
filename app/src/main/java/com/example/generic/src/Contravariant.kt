package com.example.generic.src

//Contravariant artinya kita bisa melakukan subtitusi superty dengan subtype
/*
Tidak Semua jenis class generic yang mendukung Contravariant,
hanya class generic yang menggunakan generic parameter type sebagai return type function
*/

class Contravariant<in T> {
    fun sayHello (name: T){
        return println("Hello $name")
    }
}

fun main() {
    val data1 : Contravariant<Any> = Contravariant()
    val data2 : Contravariant<String> = data1
}