package com.example.generic.src

class Function(val nama :String ) {

    fun <T> sayHello(param : T){
        println("Hello $param, My Name Is $nama")
    }

}

fun main() {
    val function = Function("Simp")

    function.sayHello("okayo")
    function.sayHello<Int>(9)
}