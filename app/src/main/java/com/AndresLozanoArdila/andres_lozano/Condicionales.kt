package com.AndresLozanoArdila.andres_lozano

class Condicionales {

}

fun main() {
    println("ingrese el primer numero")
    var num1: Int = readLine()!!.toInt()

    println("ingrese el segundo numero")
    var num2: Int = readLine()!!.toInt()

    if (num1 > num2) {
        println("el primer numero es el mayor: $num1")
    } else if (num1 == num2) {
        println("los dos numeros son iguales: $num1,$num2")
    } else {
        println("el segundo numero es el mayor: $num2")
    }

    println("ingrese un numero de 1 a 20")
    val num3: Int = readLine()!!.toInt()
    if (num3 in 1..20){
        println("el numero esta entre el rango $num3")
    } else {
        println("el numero que usted digito no esta entre el rango de 1 a 20")
    }

    var results : Int = (1..50).random() // Generación de números aleatorios
    println("El numero es $results")

    when (results) {
        0 -> println("no hay resultados")
        1,2,3,4,5 -> println("Hay menos de 5 resultados")
        in 6..50 -> println("Hay entre 5 y 50 resultados!")
        else -> println("esos son bastantes resultados!")
    }
}

