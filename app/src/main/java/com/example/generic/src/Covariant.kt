package com.example.generic.src

//covariant artinya kita melakukan subtitusi atau subtype(child) dengan supertype(parent)

/*
Tidak Semua jenis class generic yang mendukung covariant,
hanya class generic yang menggunakan generic parameter type sebagai return type function
*/

//untuk kata kuncinya kita akan menggunakan out


class Covariant<out T> (val data : T){
    fun data() : T{
        return data
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("Gharyn")
    val data2 : Covariant<Any> = data1
}