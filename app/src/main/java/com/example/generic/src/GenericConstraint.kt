package com.example.generic.src

/*terkadang kita ingin membatasi data yang belom di gunakan di generic parameter type
kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang di perbolehkan
secara otomasih, type data yang bisa di gunakan adalah type yang sudah kita sebutkan secara default constarin
type untuk generic parameet type adalah any, sehingga semua tipe data bisa digunakan*/

open class Employee

class manager : Employee()
class VicePresident : Employee()
class Compeny<T : Employee>(val employee: T)

fun main() {
    val data1 = Compeny(manager())
    val data2 = Compeny(VicePresident())
}